package exercicio01;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		
		LocalDateTime tempo = LocalDateTime.now();
		
		int hora = tempo.getHour();
		int minuto = tempo.getMinute();
		int ano = tempo.getYear();
		int mes = tempo.getMonthValue();
		int dia = tempo.getDayOfMonth();
		
		JOptionPane.showMessageDialog(null, "Data: "+dia+"/"+mes+"/"+ano+"           Hora exata: "+hora+":"+minuto);
		
		String menu = "Data por extenso:\n";
		String menu1 = "";
		String menu2 = "";
		String menu3 = "";
		String menu4 = "";
		String menu5 = "\n";
		String menuh = "Hora por extenso:\n";
		String menuh1 = "";
		
		
		boolean valida = false;
		
		//Obter por extenso
		if(dia == 1) {
			menu += "Dia primeiro";
		}else if(dia == 2) {
			menu += "Dia dois";
		}else if(dia == 3) {
			menu += "Dia três";
		}else if(dia == 4) {
			menu += "Dia quatro";
		}else if(dia == 5) {
			menu += "Dia cinco";
		}else if(dia == 6) {
			menu += "Dia seis";
		}else if(dia == 7) {
			menu += "Dia sete";
		}else if(dia == 8) {
			menu += "Dia oito";
		}else if(dia == 9) {
			menu += "Dia nove";
		}else if(dia == 10) {
			menu += "Dia dez";
		}else if(dia == 11) {
			menu += "Dia onze";
		}else if(dia == 12) {
			menu += "Dia doze";
		}else if(dia == 13) {
			menu += "Dia treze";
		}else if(dia == 14) {
			menu += "Dia quatorze";
		}else if(dia == 15) {
			menu += "Dia quinze";
		}else if(dia == 16) {
			menu += "Dia dezesseis";
		}else if(dia == 17) {
			menu += "Dia dezessete";
		}else if(dia == 18) {
			menu += "Dia dezoito";
		}else if(dia == 19) {
			menu += "Dia dezenove";
		}else if(dia == 20) {
			menu += "Dia vinte";
		}else if(dia == 21) {
			menu += "Dia vinte e um";
		}else if(dia == 22) {
			menu += "Dia vinte e dois";
		}else if(dia == 23) {
			menu += "Dia vinte e três";
		}else if(dia == 24) {
			menu += "Dia vinte e quatro";
		}else if(dia == 25) {
			menu += "Dia vinte e cinco";
		}else if(dia == 26) {
			menu += "Dia vinte e seis";
		}else if(dia == 27) {
			menu += "Dia vinte e sete";
		}else if(dia == 28) {
			menu += "Dia vinte e oito";
		}else if(dia == 29) {
			menu += "Dia vinte e nove";
		}else if(dia == 30) {
			menu += "Dia trinta";
		}else if(dia == 31) {
			menu += "Dia trinta e um";
		}
		
		if (mes == 1 ) {
			menu1 += "de janeiro";
		}else if (mes == 2) {
			menu1 += "de fevereiro";
		}else if (mes == 3) {
			menu1 += "de março";
		}else if (mes == 4) {
			menu1 += "de abril";
		}else if (mes == 5) {
			menu1 += "de maio";
		}else if (mes == 6) {
			menu1 += "de junho";
		}else if (mes == 7) {
			menu1 += "de julho";
		}else if (mes == 8) {
			menu1 += "de agosto";
		}else if (mes == 9) {
			menu1 += "de setembro";
		}else if (mes == 10) {
			menu1 += "de outubro";
		}else if (mes == 11) {
			menu1 += "de novembro";
		}else if (mes == 12) {
			menu1 += "de dezembro";
		}
		
		String anoteste = String.valueOf(ano);
		System.out.println(anoteste.charAt(0));
		
		if(anoteste.charAt(0) == '1') {
			menu2 += " de mil";
		}else if (anoteste.charAt(0) == '2') {
			menu2 += " de dois mil";
		}else if (anoteste.charAt(0) == '3') {
			menu2 += " de três mil";
		}else if (anoteste.charAt(0) == '4') {
			menu2 += " de quatro mil";
		}else if (anoteste.charAt(0) == '5') {
			menu2 += " de cinto mil";
		}else if (anoteste.charAt(0) == '6') {
			menu2 += " de seis mil";
		}else if (anoteste.charAt(0) == '7') {
			menu2 += " de sete mil";
		}else if (anoteste.charAt(0) == '8') {
			menu2 += " de oito mil";
		}else if (anoteste.charAt(0) == '9') {
			menu2 += " de nove mil";
		}
		
		String ano2 = String.valueOf(ano);
		System.out.println(ano2.charAt(1));
		
		if (ano2.charAt(1) == '0') {
			menu3 += "";
		}else if(ano2.charAt(1) == '1') {
			menu3 += " cento";
		}else if(ano2.charAt(1) == '2') {
			menu3 += " duzentos";
		}else if(ano2.charAt(1) == '3') {
			menu3 += " trezentos";
		}else if(ano2.charAt(1) == '4') {
			menu3 += " quatrocentos";
		}else if(ano2.charAt(1) == '5') {
			menu3 += " quinhentos";
		}else if(ano2.charAt(1) == '6') {
			menu3 += " seiscentos";
		}else if(ano2.charAt(1) == '7') {
			menu3 += " setecentos";
		}else if(ano2.charAt(1) == '8') {
			menu3 += " oitocentos";
		}else if(ano2.charAt(1) == '9') {
			menu3 += " novecentos";
		}
		
		String ano3 = String.valueOf(ano);
		System.out.println(ano3.charAt(2));
		String ano4 = String.valueOf(ano);
		System.out.println(ano4.charAt(3));
		
		if(ano3.charAt(2) == 0) {
			menu4 += "";
			valida = true;
		}else if ((ano3.charAt(2) == '0') && (ano4.charAt(3) == '1')) {
			menu4 += " e um";
			valida = true;
		}else if ((ano3.charAt(2) == '0') && (ano4.charAt(3) == '2')) {
			menu4 += " e dois";
			valida = true;
		}else if ((ano3.charAt(2) == '0') && (ano4.charAt(3) == '3')) {
			menu4 += " e três";
			valida = true;
		}else if ((ano3.charAt(2) == '0') && (ano4.charAt(3) == '4')) {
			menu4 += " e quatro";
			valida = true;
		}else if ((ano3.charAt(2) == '0') && (ano4.charAt(3) == '5')) {
			menu4 += " e cinco";
			valida = true;
		}else if ((ano3.charAt(2) == '0') && (ano4.charAt(3) == '6')) {
			menu4 += " e seis";
			valida = true;
		}else if ((ano3.charAt(2) == '0') && (ano4.charAt(3) == '7')) {
			menu4 += " e sete";
			valida = true;
		}else if ((ano3.charAt(2) == '0') && (ano4.charAt(3) == '8')) {
			menu4 += " e oito";
			valida = true;
		}else if ((ano3.charAt(2) == '0') && (ano4.charAt(3) == '9')) {
			menu4 += " e nove";
			valida = true;
		}else if ((ano3.charAt(2) == '1') && (ano4.charAt(3) == '0')) {
			menu4 += " e dez";
			valida = true;
		}else if ((ano3.charAt(2) == '1') && (ano4.charAt(3) == '1')) {
			menu4 += " e onze";
			valida = true;
		}else if ((ano3.charAt(2) == '1') && (ano4.charAt(3) == '2')) {
			menu4 += " e doze";
			valida = true;
		}else if ((ano3.charAt(2) == '1') && (ano4.charAt(3) == '3')) {
			menu4 += " e treze";
			valida = true;
		}else if ((ano3.charAt(2) == '1') && (ano4.charAt(3) == '4')) {
			menu4 += " e quatorze";
			valida = true;
		}else if ((ano3.charAt(2) == '1') && (ano4.charAt(3) == '5')) {
			menu4 += " e quinze";
			valida = true;
		}else if ((ano3.charAt(2) == '1') && (ano4.charAt(3) == '6')) {
			menu4 += " e dezesseis";
			valida = true;
		}else if ((ano3.charAt(2) == '1') && (ano4.charAt(3) == '7')) {
			menu4 += " e dezessete";
			valida = true;
		}else if ((ano3.charAt(2) == '1') && (ano4.charAt(3) == '8')) {
			menu4 += " e dezoito";
			valida = true;
		}else if ((ano3.charAt(2) == '1') && (ano4.charAt(3) == '9')) {
			menu4 += " e dezenove";	
			valida = true;
		}
			
			while(valida == false) {
		if (ano3.charAt(2) == '2') {
			menu4 += " e vinte";
		}else if (ano3.charAt(2) == '3') {
			menu4 += " e trinta";
		}else if (ano3.charAt(2) == '4') {
			menu4 += " e quarenta";
		}else if (ano3.charAt(2) == '5') {
			menu4 += " e cinquenta";
		}else if (ano3.charAt(2) == '6') {
			menu4 += " e sessenta";
		}else if (ano3.charAt(2) == '7') {
			menu4 += " e setenta";
		}else if (ano3.charAt(2) == '8') {
			menu4 += " e oitenta";
		}else if (ano3.charAt(2) == '9') {
			menu4 += " e noventa";
		}
		
		
		if (ano4.charAt(3) == '0') {
			menu5 += "";
		}else if (ano4.charAt(3) == '1') {
			menu5 += " um";
		}else if (ano4.charAt(3) == '2') {
			menu5 += " dois";
		}else if (ano4.charAt(3) == '3') {
			menu5 += " três";
		}else if (ano4.charAt(3) == '4') {
			menu5 += " quatro";
		}else if (ano4.charAt(3) == '5') {
			menu5 += " cinco";
		}else if (ano4.charAt(3) == '6') {
			menu5 += " seis";
		}else if (ano4.charAt(3) == '7') {
			menu5 += " sete";
		}else if (ano4.charAt(3) == '8') {
			menu5 += " oito";
		}else if (ano4.charAt(3) == '9') {
			menu5 += " nove";
		}
			}
			
		String hora1 = String.valueOf(hora);
		
		if(hora1.charAt(0) == '0' && hora1.charAt(1) == '0') {
			menuh += " Meia noite";
		}else if (hora1.charAt(0) == '0' && hora1.charAt(1) == '1') {
			menuh += " Uma hora";
		}else if (hora1.charAt(0) == '0' && hora1.charAt(1) == '2') {
			menuh += " Duas horas";
		}else if (hora1.charAt(0) == '0' && hora1.charAt(1) == '3') {
			menuh += " Três horas";
		}else if (hora1.charAt(0) == '0' && hora1.charAt(1) == '4') {
			menuh += " Quatro horas";
		}else if (hora1.charAt(0) == '0' && hora1.charAt(1) == '5') {
			menuh += " Cinco horas";
		}else if (hora1.charAt(0) == '0' && hora1.charAt(1) == '6') {
			menuh += " Seis horas";
		}else if (hora1.charAt(0) == '0' && hora1.charAt(1) == '7') {
			menuh += " Sete horas";
		}else if (hora1.charAt(0) == '0' && hora1.charAt(1) == '8') {
			menuh += " Oito horas";
		}else if (hora1.charAt(0) == '0' && hora1.charAt(1) == '9') {
			menuh += " Nove horas";
		}else if (hora1.charAt(0) == '1' && hora1.charAt(1) == '0') {
			menuh += " Dez horas";
		}else if (hora1.charAt(0) == '1' && hora1.charAt(1) == '1') {
			menuh += " Onze horas";
		}else if (hora1.charAt(0) == '1' && hora1.charAt(1) == '2') {
			menuh += " Doze horas";
		}else if (hora1.charAt(0) == '1' && hora1.charAt(1) == '3') {
			menuh += " Treze horas";
		}else if (hora1.charAt(0) == '1' && hora1.charAt(1) == '4') {
			menuh += " Quatorze horas";
		}else if (hora1.charAt(0) == '1' && hora1.charAt(1) == '5') {
			menuh += " Quinze horas";
		}else if (hora1.charAt(0) == '1' && hora1.charAt(1) == '6') {
			menuh += " Dezesseis horas";
		}else if (hora1.charAt(0) == '1' && hora1.charAt(1) == '7') {
			menuh += " Dezessete horas";
		}else if (hora1.charAt(0) == '1' && hora1.charAt(1) == '8') {
			menuh += " Dezoito horas";
		}else if (hora1.charAt(0) == '1' && hora1.charAt(1) == '9') {
			menuh += " Dezenove horas";
		}else if (hora1.charAt(0) == '2' && hora1.charAt(1) == '0') {
			menuh += " Vinte horas";
		}else if (hora1.charAt(0) == '2' && hora1.charAt(1) == '1') {
			menuh += " Vinte e uma horas";
		}else if (hora1.charAt(0) == '2' && hora1.charAt(1) == '2') {
			menuh += " Vinte e duas horas";
		}else if (hora1.charAt(0) == '2' && hora1.charAt(1) == '3') {
			menuh += " Vinte e três horas";
		}else if (hora1.charAt(0) == '2' && hora1.charAt(1) == '4') {
			menuh += " Meia night, hora de safadeza";
		}
			
		String min1 = String.valueOf(minuto);
		
		if(min1.charAt(0) == '0' && min1.charAt(1) == '0') {
			menuh1 += " em ponto";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '1') {
			menuh1 += " e um minuto";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '2') {
			menuh1 += " e dois minutos";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '3') {
			menuh1 += " e três minutos";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '4') {
			menuh1 += " e quatro minutos";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '5') {
			menuh1 += " e cinco minutos";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '6') {
			menuh1 += " e seis minutos";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '7') {
			menuh1 += " e sete minutos";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '8') {
			menuh1 += " e oito minutos";
		}else if(min1.charAt(0) == '0' && min1.charAt(1) == '9') {
			menuh1 += " e nove minutos";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '0') {
			menuh1 += " e dez minutos";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '0') {
			menuh1 += " e dez minutos";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '1') {
			menuh1 += " e onze minutos";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '2') {
			menuh1 += " e doze minutos";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '3') {
			menuh1 += " e treze minutos";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '4') {
			menuh1 += " e quatorze minutos";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '5') {
			menuh1 += " e quinze minutos";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '6') {
			menuh1 += " e dezesseis minutos";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '7') {
			menuh1 += " e dezessete minutos";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '8') {
			menuh1 += " e dezoito minutos";
		}else if(min1.charAt(0) == '1' && min1.charAt(1) == '9') {
			menuh1 += " e dezenove minutos";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '0') {
			menuh1 += " e vinte minutos";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '1') {
			menuh1 += " e vinte um minutos";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '2') {
			menuh1 += " e vinte dois minutos";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '3') {
			menuh1 += " e vinte três minutos";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '4') {
			menuh1 += " e vinte quatro minutos";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '5') {
			menuh1 += " e vinte cinco minutos";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '6') {
			menuh1 += " e vinte seis minutos";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '7') {
			menuh1 += " e vinte sete minutos";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '8') {
			menuh1 += " e vinte oito minutos";
		}else if(min1.charAt(0) == '2' && min1.charAt(1) == '9') {
			menuh1 += " e vinte nove minutos";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '0') {
			menuh1 += " e trinta minutos";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '1') {
			menuh1 += " e trinta e um minutos";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '2') {
			menuh1 += " e trinta e dois minutos";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '3') {
			menuh1 += " e trinta e três minutos";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '4') {
			menuh1 += " e trinta e  quatro minutos";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '5') {
			menuh1 += " e trinta e cinco minutos";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '6') {
			menuh1 += " e trinta e seis minutos";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '7') {
			menuh1 += " e trinta e sete minutos";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '8') {
			menuh1 += " e trinta e oito minutos";
		}else if(min1.charAt(0) == '3' && min1.charAt(1) == '9') {
			menuh1 += " e trinta e nove minutos";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '0') {
			menuh1 += " e quarenta minutos";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '1') {
			menuh1 += " e quarenta e um minutos";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '2') {
			menuh1 += " e quarenta e dois minutos";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '3') {
			menuh1 += " e quarenta e três minutos";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '4') {
			menuh1 += " e quarenta e quatro minutos";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '5') {
			menuh1 += " e quarenta e cinco minutos";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '6') {
			menuh1 += " e quarenta e seis minutos";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '7') {
			menuh1 += " e quarenta e sete minutos";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '8') {
			menuh1 += " e quarenta e oito minutos";
		}else if(min1.charAt(0) == '4' && min1.charAt(1) == '9') {
			menuh1 += " e quarenta e nove minutos";
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '0') {
			menuh1 += " e cinquenta minutos";
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '1') {
			menuh1 += " e cinquenta e um minutos";
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '2') {
			menuh1 += " e cinquenta e dois minutos";
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '3') {
			menuh1 += " e cinquenta e três minutos";
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '4') {
			menuh1 += " e cinquenta e quatro minutos";
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '5') {
			menuh1 += " e cinquenta e cinco minutos";
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '6') {
			menuh1 += " e cinquenta e seis minutos";
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '7') {
			menuh1 += " e cinquenta e sete minutos";
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '8') {
			menuh1 += " e cinquenta e oito minutos";
		}else if(min1.charAt(0) == '5' && min1.charAt(1) == '9') {
			menuh1 += " e cinquenta e nove minutos";
		}
		
		JOptionPane.showMessageDialog(null, menu+" "+menu1+""+menu2+""+menu3+""+menu4+""+menu5+""+menuh+""+menuh1);
		
	 
	}

}
