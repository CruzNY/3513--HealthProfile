/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexiscruz
 */
public class HealthProfile {
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;
    private int age;
    private String sex;
    private int height;
    private double weight;
    
    public void setGen(String g){
        sex = g;
    }
    public void setFirstName(String fn){
	firstName = fn;
    }
    public String getFirstName(){
	return firstName;
    }
    public void setLastName(String ln){
	lastName = ln;
    }
    public String getLastName(){
	return lastName;
    }
    public int getMonth(){
	return month;
    }
    public void setMonth(int m){
	month = m;
    }
    public int getDay(){
	return day;
    }
    public void setDay(int d){
	day = d;
    }
    public int getYear(){
	return year;
    }
    public void setYear(int y){
	year = y;
    }
    public void setHeight(int h){
	height = h;
    }
    public void setHeight(int f, int i){
	int fIN = f*12;
	height = fIN + i;
    }
    public double getHeight(){
	return height;
    }
    public void setWeight(double w){
	weight = w;
    }
    public double getWeight(){
	return weight;
    }
    public int calcAge(){
	age = 2017 - year;
	if(month>=12)
	    if(day>3)
		age--;
        return age;
    }
    public int calcMaxHR(){
	int max = 220-age;
        return max;
    }
	
    public String calcTargetHR(){
        double min = .5 * calcMaxHR();
        double max = .85 * calcMaxHR();
        return (getFirstName()+"'s target Heart Rate is between "+min+" and "+ max+" beats/min");
    }
    public String getInfo(){
        String info = "First Name: "+getFirstName()+"\n"+
	    "Last Name: "+getLastName()+"\n"+
	    "DOB: "+getMonth()+"/"+getDay()+"/"+getYear()+"\n"+
                "Sex: "+sex+"\n"+
                "Age: "+calcAge()+"\n"+
                "Height: "+ calcHeight()+" and Weight: "+getWeight()+"\n"+
                calcTargetHR()+"\n"+
                "Max Heart Rate "+calcMaxHR()+" beats/min \n"+
                "BMI: " + calcBMI();
        return info;
    }
    public String calcHeight(){
        int feet = height / 12;
        int inch = height %12;
        return (feet+"'"+inch);
    }
    public String calcBMI(){
	double BMI = (weight * 703)/(height * height);
        if(BMI < 18.5)
            return (BMI+" You are underweight");
        else if(BMI >18.5 && BMI < 24.9)
            return (BMI+" You are Normal");
        else if(BMI >25 && BMI <29.9)
            return (BMI + " You are Overweight");
        else
            return (BMI + " You are Obese");
    }
    
}
