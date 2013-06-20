/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */ 
package dsproject;

import java.util.Date;

/**
 *
 * @author Cliente
 */
public class Evaluation {
    private Date date;
    private String time;
    private String temperature;
    private float corporalMass;
    private float stature;
    private int imc;
    private float spread;
    private float sitAndReach;
    private int abdominal;
    private float _9Minutes;
    private float _6Minutes;
    private float horizontalJump;
    private float medicineBallThrow;
    private float squareTest;
    private float _20MetersRace;    
    
    public Evaluation(Date dateParam, String timeParam, String temperatureParam){
        this.date = dateParam;
        this.time = timeParam;
        this.temperature = temperatureParam;
    }

    public float get20MetersRace() {
        return _20MetersRace;
    }

    public void set20MetersRace(float _20MetersRace) {
        this._20MetersRace = _20MetersRace;
    }

    public float get6Minutes() {
        return _6Minutes;
    }

    public void set6Minutes(float _6Minutes) {
        this._6Minutes = _6Minutes;
    }

    public float get9Minutes() {
        return _9Minutes;
    }

    public void set9Minutes(float _9Minutes) {
        this._9Minutes = _9Minutes;
    }

    public int getAbdominal() {
        return abdominal;
    }

    public void setAbdominal(int abdominal) {
        this.abdominal = abdominal;
    }

    public float getCorporalMass() {
        return corporalMass;
    }

    public void setCorporalMass(float corporalMass) {
        this.corporalMass = corporalMass;
    }

    public float getHorizontalJump() {
        return horizontalJump;
    }

    public void setHorizontalJump(float horizontalJump) {
        this.horizontalJump = horizontalJump;
    }

    public int getImc() {
        return imc;
    }

    public void setImc(int imc) {
        this.imc = imc;
    }

    public float getMedicineBallThrow() {
        return medicineBallThrow;
    }

    public void setMedicineBallThrow(float medicineBallThrow) {
        this.medicineBallThrow = medicineBallThrow;
    }

    public float getSitAndReach() {
        return sitAndReach;
    }

    public void setSitAndReach(float sitAndReach) {
        this.sitAndReach = sitAndReach;
    }

    public float getSpread() {
        return spread;
    }

    public void setSpread(float spread) {
        this.spread = spread;
    }

    public float getSquareTest() {
        return squareTest;
    }

    public void setSquareTest(float squareTest) {
        this.squareTest = squareTest;
    }

    public float getStature() {
        return stature;
    }

    public void setStature(float stature) {
        this.stature = stature;
    }

    public Date getDate() {
        return date;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getTime() {
        return time;
    }
    
    
    
    
}
