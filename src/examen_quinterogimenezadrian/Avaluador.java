/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_quinterogimenezadrian;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pep
 * 
 * L'objectiu de la classe Avaluador és avaluar Estudiants.
 * 
 * Es tracta de validar els seus mètodes amb la llibreria JUnit
 * 
 * 1. Tests de tots els mètodes públics i correcció de possible errors (fins a 5 punts)
 * 
 * 2. 15 tests parametritzats de cada mètode public (3 punts)
 * 
 * 3. Tests @Rule de timeout i control d'excepcions de tots els mètodes publics (2 punts)
 * 100-150 milisegundos
 * 
 */
public class Avaluador {

    private double notaMaxima = 10.0;
    private double notaMinima = 0.0;
    private double notaSupera = 5.0;

    public Avaluador(double notaMaxima, double notaMinima, double notaSupera) throws Exception {
        if (notaMinima >= notaMaxima) {
            throw new Exception("Nota mínima " + notaMinima + " no pot ser major que nota màxima " + notaMaxima);
        }

        if (notaSupera < notaMinima || notaSupera > notaMaxima) {
            throw new Exception("Nota supera" + notaSupera + " no pot ser menor que nota mínima " + notaMinima + " ni major que nota màxima " + notaMaxima);
        }

        this.notaMaxima = notaMaxima;
        this.notaMinima = notaMinima;
        this.notaSupera = notaSupera;
    }

    public Avaluador() {
    }

    /**
     * 
     * Aquest mètode ha de retornar la mitjana de les tres notes parcials 
     * d'un estudiant si totes són iguals o superiors a notaSupera.
     * 
     * @param estudiant
     * @return la nota mitjana si totes les notes són iguals o superiors a
     * notaSupera
     * @throws Exception
     * Estudiante tiene 3 notas, cada media tiene que estar aprobada (més gran o igual que 5)
     */
    public double mitjanaSiSupera(Estudiant estudiant) throws Exception {
        double sumaNotes = 0;

        if (estudiant == null) {
            throw new Exception("Estudiant no pot ser null");
        }

        if (estudiant.getPrimerParcial() >= notaSupera) {
            if (estudiant.getSegundoParcial() >= notaSupera) {
                if (estudiant.getTercerParcial() >= notaSupera) {
                    sumaNotes = estudiant.getPrimerParcial()
                            + estudiant.getSegundoParcial()
                            + estudiant.getTercerParcial();
                }
            }
        }

        return sumaNotes / 3;
    }

    /**
     * 
     * Aquest mètode ha de retornar la mitja de totes les notes parcials d'un
     * estudiant
     * 
     * @param estudiant
     * @return la nota mitjana
     * @throws Exception
     * Sigui les que siguin y només dividim per 3.
     */
    public double mitjana(Estudiant estudiant) throws Exception {
        double sumaNotes = 0;

        if (estudiant == null) {
            throw new Exception("Estudiant no pot ser null");
        }

        sumaNotes = estudiant.getPrimerParcial()
                + estudiant.getSegundoParcial()
                + estudiant.getTercerParcial();

        return sumaNotes / 3;
    }

    /**
     * 
     * Aquest mètode ha de retornar l'estudiant que té una nota mitjana més 
     * alta
     * 
     * @param estudiants
     * @return l'estudiant amb nota mitjana més alta
     * Recorre aquest array, calcula la mitjana y en unes variables auxiliars 
     * va guardant la millor nota y el millor estudiant.
     * 
     * Errores en el primer y l'últim, habitualment l'últim
     */
    public Estudiant millorEstudiantPerNotaMitjana(Estudiant[] estudiants) {
        final int n = estudiants.length;
        Estudiant millorEstudiant = null;
        double millorNota = 0;

        
        for (int i = 0; i < n - 1; i++) {
            try {
                double nota = mitjana(estudiants[i]);
                if (nota > millorNota) {
                    nota = millorNota;
                    millorEstudiant = estudiants[i];
                }
            } catch (Exception ex) {
                Logger.getLogger(Avaluador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return millorEstudiant;
    }

}
