/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swexamen1;

/**
 *
 * @author michelle
 */
public class Registro {
    private double resultado_medico;
    private TipoResultado Tipo_resultado;
    private String referencia;
    private String evaluacion;

    public Registro(double resultado_medico, TipoResultado Tipo_resultado, String referencia, String evaluacion) {
        this.resultado_medico = resultado_medico;
        this.Tipo_resultado = Tipo_resultado;
        this.referencia = referencia;
        this.evaluacion = evaluacion;
    }

    
 

    public double getResultado_medico() {
        return resultado_medico;
    }

    public void setResultado_medico(double resultado_medico) {
        this.resultado_medico = resultado_medico;
    }

    public TipoResultado getTipo_resultado() {
        return Tipo_resultado;
    }

    public void setTipo_resultado(TipoResultado Tipo_resultado) {
        this.Tipo_resultado = Tipo_resultado;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }

   
    
    
}
