package trabralf;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um formulário
				JFrame formulario = new JFrame();
				formulario.setTitle("Meu primeiro formulário");
				formulario.setSize(800, 800);
				formulario.setLayout(null);
				formulario.setLocationRelativeTo(null);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.getContentPane().setBackground(new Color(255, 255, 255));
				
		//Titulo
				
				JLabel titulo = new JLabel();
				titulo.setBounds(220, 5, 600, 100);
				titulo.setText("Colégio Ralf Lima");
				titulo.setFont(new Font("Times New Roman", Font.PLAIN, 55));
			
		//botao medias		
				JButton Media = new JButton();
				Media.setText("Calculo de média");
				Media.setBounds(20, 150, 150, 30);
				
				//Ação medias
				Media.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						double n1, n2, n3, n4;
		
						n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua 1ª nota"));
						n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua 2ª nota"));
						n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua 3ª nota"));
						n4 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua 4ª nota"));
						JOptionPane.showMessageDialog(null, "Sua média é: "+((n1+n2+n3+n4)/4));
						
					}
				});
		
		// botao formularios
				JButton formularios = new JButton();
				formularios.setText("Formulários");
				formularios.setBounds(20, 200, 150, 30);
		
		//ação no formularios
				formularios.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Object[] gabarito = {"Física", "Quimica", "Matematica"};
						
						int gabaritos = JOptionPane.showOptionDialog(null, "Qual formulário deseja?", "Formulário", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, gabarito, 0);
					
						switch (gabaritos) {
						case 0:
							JOptionPane.showMessageDialog(null, "Formulario de Física"
									+"\nMECÃ‚NICA 1-CINEMÁTICA"
									+"\nVelocidade média: V = s / t "+"\nAceleração média: a = v / t"
									+"\n"
									+"\nMOVIMENTO UNIFORME (MU). "
									+"\nS = S0 + v.t"
									+"\n"
									+"\nMOVIMENTO UNIFORMEMENTE VARIADO (MUV)"
									+"\nS = SO + VO.t + a.t²/2 "+"\nV = Vo + a.t"+"\nV² = vo²+2.a.s"
									+"\n"
									+"\nQUEDA LIVRE e LANÃ‡AMENTO VERTICAL"
									+"\ng = 10 m/s"
									+"\n"
									+"\n MOVIMENTO CIRCULAR"
									+"\n acp = V² / R "+"\nT = 1/ f"+"\n Ï‰ = âˆ†Ï• / âˆ†t "+"\nÏ‰ = 2.Ï€ / T = 2.Ï€.f "+"\n V = Ï‰.R "+"\n s = Î¸.R"
									);
							break;
							
						case 1:
							JOptionPane.showMessageDialog(null, "FormulÃ¡rio de Quimica"
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
									+"\nTrapÃ©zio --> A = (B+b/2).h"+"\nCirulo --> A = pi.r²/2"+"\nCone --> A = pi.r.g"
									+"\nEsfera --> A = 4.pi.r²"
									+"\n"
									+"\nVOLUMES"
									+"\nCubo --> V = l³"+"\nParalelepipedo --> V = c.l.h"+"\nPrisma regular --> ab.h"
									+"\nCilindro --> V = pi.r².h"
									+"\n"
									+"\nFORMULAS DE RESOLUÇÃO"
									+"\nax²+bx+c=0"
									+"\nx = -b +- b²+a.c / 2.a"
									+"\n(a+b).(a-b) = aÂ²-bÂ²"
									+"\n(a+b)² = a²+2ab+b²"
									+"\n"
									+"\nTRIGONOMETRIA"
									+"\nsen = c.o / hip"
									+"\ncon = c.a / hip"
									+"\ntg = c.o / c.a"
									+"\ntg = sen Î± / conse Î±"
									+"\n"
									+"\nGEOMETRIA"
									+"\nV+F = A+2"
									+"\nSi=(n-2)—180º"
									+"\nHip² = L1²+L2²"
									);
						break;
						}
					
					}
				});
				
				
		//botao mensalidade
				JButton mensalidade = new JButton();
				mensalidade.setText("Mensalidades");
				mensalidade.setBounds(20, 250, 150, 30);
				
		//ação mensalidade
				mensalidade.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						//Colocar em casa
						
					}
				});
				
			
		//botao provas
				JButton provas = new JButton();
				provas.setText("Provas e trabalhos");
				provas.setBounds(20, 300, 150, 30);
				
		//Adicionando ação provas
				provas.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						//Colocar em casa
						
					}
				});
				
		//Botão contatenos
				JButton contato = new JButton();
				contato.setText("Contate-nos");
				contato.setBounds(20, 650, 150, 30);
				
		//Adicionando ação contato	
				
				contato.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Colegio Ralf Lima"+"\nLocalização: Rua 7 de setembro, Blumenau"+"\nEmail: CRL@gmail.com.br "+"\nTelefone: 47 8803-5591");
						
					}
				});
				
		//Finalizar sessão
				JButton finalizar = new JButton();
				finalizar.setText("Finalizar sessão");
				finalizar.setBounds(20, 700, 150, 30);
				
		//ação finalizar sessão
				finalizar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
						
					}
				});
				
		//Jpanel
				JPanel caixa = new JPanel();
				caixa.setBounds(0, 125, 190, 800);
				caixa.setBackground(new Color(130, 130, 130));
				caixa.setVisible(true);
				
		//Logo
				JLabel imlogo = new JLabel();
				URL caminhoimagem;
				try {
					caminhoimagem = new URL("http://www.javaassignmenthelp.net/wp-content/uploads/2014/08/school-management-system-project.png");
					ImageIcon icone = new ImageIcon(caminhoimagem);
					imlogo.setIcon(icone);
					imlogo.setBounds(-60, 0, 250, 126);
				} catch (Exception e) { }
				
		//Noticias
				JLabel n1 = new JLabel();
				URL caminhonoticia1;
				try {
					caminhonoticia1 = new URL("http://sismmac.org.br/disco/post/falta_seguranca_card1.png");
					ImageIcon icone = new ImageIcon(caminhonoticia1);
					n1.setIcon(icone);
					n1.setBounds(215, 115, 400, 400);
				} catch (Exception e) { }
				
				JLabel n2 = new JLabel();
				URL caminhonoticia2;
				try {
					caminhonoticia1 = new URL("http://escoladenoticias.org/wp-content/uploads/2017/07/hor_logo_EDN_2015.png");
					ImageIcon icone = new ImageIcon(caminhonoticia1);
					n2.setIcon(icone);
					n2.setBounds(278, 465, 500, 250);
				} catch (Exception e) { }

				JLabel n3 = new JLabel();
				URL caminhonoticia3;
				try {
					caminhonoticia1 = new URL("https://2ef52w414cjs3ozn6e1bx95f-wpengine.netdna-ssl.com/wp-content/uploads/2013/10/g1.jpg");
					ImageIcon icone = new ImageIcon(caminhonoticia1);
					n3.setIcon(icone);
					n3.setBounds(235, 200, 450, 245);
					n3.setVisible(false);
				} catch (Exception e) { }
				
				JLabel n4 = new JLabel();
				URL caminhonoticia4;
				try {
					caminhonoticia1 = new URL("https://pbs.twimg.com/profile_images/1034334931328090112/c8SJDm3f_400x400.jpg");
					ImageIcon icone = new ImageIcon(caminhonoticia1);
					n4.setIcon(icone);
					n4.setBounds(265, 455, 400, 300);
					n4.setVisible(false);
				} catch (Exception e) { }
				
				
				//botão atualizar
				JButton atualizar = new JButton();
				atualizar.setText("Atualizar pagina");
				atualizar .setBounds(20, 400, 150, 30);
				
				//ação
				atualizar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						n1.setVisible(false);
						n2.setVisible(false);
						n3.setVisible(true);
						n4.setVisible(true);
						
					}
				});		
				
		//quadro noticias
				JPanel noticias = new JPanel();
				noticias.setBounds(190, 125, 700, 900);
				noticias.setBackground(new Color(175, 233, 237));
				noticias.setVisible(true);
			
		//titulo noticias		
				JLabel noticias1 = new JLabel();
				noticias1.setBounds(225, 120, 150, 100);
				noticias1.setText("Notícias");
				noticias1.setFont(new Font("Times New Roman", Font.PLAIN, 32));
				
		//Botão faltas
				JButton faltas = new JButton();
				faltas.setText("Frequência");
				faltas.setBounds(20, 350, 150, 30);
				
		//adicionando ação botao frequencia
				faltas.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						int falta;
						falta = Integer.parseInt(JOptionPane.showInputDialog("Insirir faltas"));
						
						JOptionPane.showMessageDialog(null, "Total de frequencia : %"+(falta*100)/200);

					}
				});
				
		//Adicionar componentes ao site
				
				formulario.add(formularios);
				formulario.add(Media);
				formulario.add(mensalidade);
				formulario.add(provas);
				formulario.add(atualizar);
				formulario.add(contato);
				formulario.add(faltas);
				formulario.add(finalizar);
				formulario.add(noticias1);
				formulario.add(n1);
				formulario.add(n2);
				formulario.add(n3);
				formulario.add(n4);
				formulario.add(imlogo);
				formulario.add(titulo);
				formulario.add(caixa);
				formulario.add(noticias);
				
				
				
		
				
		//Exibir componentes
				formulario.setVisible(true);
				

	}

}
