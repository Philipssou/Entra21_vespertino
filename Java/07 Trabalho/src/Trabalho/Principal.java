package Trabalho;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Sistema para escola
		//Calcular media
		//Formularios para materias
		//Central do aluno, faltas, notas, assunto de provas.
		//Pagamentos
		//trabalhos agendados
	
		// Variaveis
		int faltas;
		String nome;
		Object[] opcs = {"Calcular Média", "Formulários", "Pagamentos", "Trabalhos e prova agendados"};
		Object[] formulario = {"Física", "Quimica", "Matematica"};
		double n1, n2, n3, n4, media;
		
		//Coletar dados
	
		JOptionPane.showMessageDialog(null, "Bem vindo ao Colégio Ralf Lima");
		nome = JOptionPane.showInputDialog("Inserir nome");
		int opc = JOptionPane.showOptionDialog(null, "O que deseja acessar?", "Acesso", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, opcs, 0);
		
		//Calcular media
		switch (opc) {
		case 0:
			n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua 1ª nota"));
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua 2ª nota"));
			n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua 3ª nota"));
			n4 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua 4ª nota"));
			JOptionPane.showMessageDialog(null, nome+"\nSua média é: "+((n1+n2+n3+n4)/4));
		break;	
				
		case 1:
			int formularios = JOptionPane.showOptionDialog(null, "Qual formulário deseja?", "Formulário", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, formulario, 0);
			
			switch (formularios) {
			case 0:
				JOptionPane.showMessageDialog(null, "Formulario de Física"
						+"\nMECÂNICA 1-CINEMÁTICA"
						+"\nVelocidade média: V = ∆s / ∆t "+"\nAceleração média: a = ∆v / ∆t"
						+"\n"
						+"\nMOVIMENTO UNIFORME (MU). "
						+"\nS = S0 + v.t"
						+"\n"
						+"\nMOVIMENTO UNIFORMEMENTE VARIADO (MUV)"
						+"\nS = SO + VO.t + a.t²/2 "+"\nV = Vo + a.t"+"\nV² = vo²+2.a.∆s"
						+"\n"
						+"\nQUEDA LIVRE e LANÇAMENTO VERTICAL"
						+"\ng = 10 m/s"
						+"\n"
						+"\n MOVIMENTO CIRCULAR"
						+"\n acp = V² / R "+"\nT = 1/ f"+"\n ω = ∆ϕ / ∆t "+"\nω = 2.π / T = 2.π.f "+"\n V = ω.R "+"\n s = θ.R"
						);
				break;
				
			case 1:
				JOptionPane.showMessageDialog(null, "Formulário de Quimica"
						+"\n"
						+"\nCONCENTRAÇÃO COMUM"
						+"\nC = m/V"
						+"\n"
						+"\nMOLARIDADE"
						+"\nM = n/V"
						+"\n"
						+"\nTITULO"
						+"\nt = n/M"
						+"\n"
						+"\nPORCENTAGEM"
						+"\n% = 100.t"
						+"\n"
						+"\nDENSIDADE"
						+"\n D = M/V"
						+"\n"
						+"\nFRAÇÃO MOLAR"
						+"\n X = n1/n"
						+"\n"
						+"\nDILUIÇÃO"
						+"\nM1.V1 = M2.V2"
						+"\n"
						+"\nMISTURA DE SOLUÇÃO DE MESMO SOLUTO"
						+"\nC1.V1+C2.V2 = Cf.Vf"
						+"\n"
						+"\nMISTURA DE SOLUÇÃO COM SOLUTO DIFERENTE"
						+"\nMa.Va.Xa = Mb.Vb.Xb"
						);
				break;
			
			case 2:
				JOptionPane.showMessageDialog(null, "Formulário de Matematica"
						+"\n"
						+"\nÁREAS"
						+"\nQuadrado --> A = l²" + "\nRetangulo --> A = l.h"+"\nTriangulo --> A = b.h/2"
						+"\nTrapézio --> A = (B+b/2).h"+"\nCirulo --> A = ╥.r²/2"+"\nCone --> A = ╥.r.g"
						+"\nEsfera --> A = 4.╥.r²"
						+"\n"
						+"\nVOLUMES"
						+"\nCubo --> V = l³"+"\nParalelepipedo --> V = c.l.h"+"\nPrisma regular --> ab.h"
						+"\nCilindro --> V = ╥.r².h"
						+"\n"
						+"\nFORMULAS DE RESOLUÇÃO"
						+"\nax²+bx+c=0"
						+"\nx = -b +- √b²+a.c / 2.a"
						+"\n(a+b).(a-b) = a²-b²"
						+"\n(a+b)² = a²+2ab+b²"
						+"\n"
						+"\nTRIGONOMETRIA"
						+"\nsen α = c.o / hip"
						+"\ncon α = c.a / hip"
						+"\ntg α = c.o / c.a"
						+"\ntg α = sen α / conse α"
						+"\n"
						+"\nGEOMETRIA"
						+"\nV+F = A+2"
						+"\nSi=(n-2)×180º"
						+"\nHip² = L1²+L2²"
						);
			break;
			}
			
		case 2:
			JOptionPane.showMessageDialog(null, "Mensalidades: R$1.000"
					+ "\nÀ Antecipado R$980"
					+ "\n"
					+ "\nA prazo: "
					+ "\n"
					+ "\n1x "+1000*1
					+ "\n2x "+((1000*0.10)+1000)
					+ "\n3x "+((1000*0.11)+1000)
					+ "\n4x "+((1000*0.12)+1000)
					+ "\n5x "+((1000*0.13)+1000)
					+ "\n6x "+((1000*0.14)+1000)
					+ "\n7x "+((1000*0.15)+1000)
					+ "\n8x "+((1000*0.16)+1000)
					+ "\n9x "+((1000*0.17)+1000)
					+ "\n10x "+((1000*0.18)+1000)
					+ "\n11x "+((1000*0.19)+1000)
					+ "\n12x "+((1000*0.20)+1000)
					);
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null, "Provas e trabalhos agendados");
		
			break;
	   }
	}

}
