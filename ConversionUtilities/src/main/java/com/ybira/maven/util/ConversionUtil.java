package com.ybira.maven.util;

public class ConversionUtil {
	
	public double convertKMToMile(double distance){
		  return (distance*0.62137);
		}
		public double convertkmToYard(double distance){
		  return distance*1093.6;
		}
		public double convertMToMile(double distance){
		  return (distance/1000)*0.62137 ;
		}
		public double convertMtoYard(double distance){
		  return (distance/1000)*1093.6;
		}
		
		/*
		 * 
		 */
	public double convertKgToLb(double weight){
		  return (weight*2.2046226218);
		}
		public double convertKGToOz(double weight){
		  return weight*35.27396195;
		}
		public double convertGramToLb(double weight){
		  return weight*0.00220462 ;
		}
		public double convertGramtoOz(double weight){
		  return weight*0.035274;
		}
}
