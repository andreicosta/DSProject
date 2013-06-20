/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Cliente
 */
public class Student {
    ArrayList<Evaluation> evaluations = new ArrayList<>();
    
    public void inserAvaliation(){
        Evaluation evaluationTemp = new Evaluation(dateParam, timeParam, temperatureParam);
        evaluations.add(evaluationTemp);
    }
    
    public Evaluation getLastAvaliation(){
        return evaluations.get(evaluations.size()-1);
    }
}
