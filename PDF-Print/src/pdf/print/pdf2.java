/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf.print;

/**
 *
 * @author mglriosr
 */

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Vector;

import com.qoppa.pdfWriter.PDFPrinterJob;

public class pdf2 implements Printable
{
	public int m_CurrentPage;
	public int m_CurrentPageStartRow;
	public int m_CurrentPageEndRow;
	public final static int DEFAULT_COLUMN_WIDTH = 72;
	public final static int CELL_MARGIN_X = 4;
	public final static int CELL_MARGIN_Y = 4;
	
	public Vector m_Data;
	public int m_ColumnWidths [];
	public boolean m_DrawGrid;
	
    public static void main (String args [])
    {
        pdf2 tablePrinter = new pdf2(initData (), null, true);
        
        PrinterJob printerJob = PDFPrinterJob.getPrinterJob();
        printerJob.setPrintable(tablePrinter);
        
        try
        {
            printerJob.print();
        }
        catch (PrinterException pe)
        {
            pe.printStackTrace();
        }
        
        // Exit
        System.exit(0);
    }
    
	public pdf2(Vector data, int [] colWidths, boolean drawGrid) 
	{
		super();
		m_Data = data;
		m_ColumnWidths = colWidths;
		m_DrawGrid = drawGrid;
	}
	
	public static Vector initData ()
	{
		Vector data = new Vector ();
		
		// Initialize data
		for (int row = 0; row < 2; ++row)
		{
			Vector rowData = new Vector ();
			for (int col = 0; col < 5; ++col)
			{
				rowData.addElement ("Cell " + row + ", " + col);
			}
			data.addElement (rowData);
		}

		return data;
	}

    pdf2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
	public int print (Graphics g, PageFormat pf, int pageIndex)
	{
		int lineHeight = g.getFontMetrics().getHeight();
		
		// Reset current pos
		int currentRow = 0;
		if (pageIndex == 0)
		{
			// Need to do this in case the instance of this class
			// gets used multiple times to print a string
			m_CurrentPage = 0;
			m_CurrentPageStartRow = 0;
		}
		// Need to do this because Java PrinterJob can call this
		// method multiple times for the same page;
		else if (m_CurrentPage == pageIndex)
		{
			currentRow = m_CurrentPageStartRow;
		}
		else
		{
			currentRow = m_CurrentPageEndRow + 1;
			m_CurrentPageStartRow = currentRow;
		}
		
		// If we're out of lines, tell the PrinterJob we're done
		if (currentRow >= m_Data.size())
		{
			return Printable.NO_SUCH_PAGE;
		}

		// Loop through lines until we fill the page
		int currentY = (int)(pf.getImageableY() + lineHeight);
		while (currentRow < m_Data.size() && 
				currentY + lineHeight < pf.getImageableY() + pf.getImageableHeight())
		{
			// Draw the next line
			int currentX = (int)pf.getImageableX();
			Vector nextRow = (Vector)m_Data.elementAt (currentRow);
			for (int col = 0; col < nextRow.size(); ++col)
			{
				String cellString = (String)nextRow.elementAt (col);
				g.drawString (cellString, currentX + CELL_MARGIN_X, currentY + CELL_MARGIN_Y);
				
				int colWidth = DEFAULT_COLUMN_WIDTH;
				if (m_ColumnWidths != null && m_ColumnWidths.length > col)
				{
					colWidth = m_ColumnWidths [col];
				}
				
				// Draw grid if needed
				if (m_DrawGrid)
				{
					g.drawRect (currentX, currentY - (lineHeight / 2), colWidth, lineHeight);
				}
				
				// Advance x
				currentX += colWidth;
			}
			
			// Advance to the next line
			++currentRow;
			currentY += lineHeight;
		}
		
		// Save the ned line and current page
		// Again, we have to do this because of multiple calls for the same page.
		m_CurrentPageEndRow = currentRow;
		m_CurrentPage = pageIndex;
		
		return Printable.PAGE_EXISTS;
	}

    void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
