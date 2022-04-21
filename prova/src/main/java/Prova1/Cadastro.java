/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova1;

/**
 *
 * @author univicosa
 */

import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args){
        
    int x,z = 10, h = 0, f = 0,g = 0,m = 0, ver, cont = 0, o = 0, nf, add, tot;
    int verm, t = 0;
    float sal = 0, por;
    

    String nomet;
    int idaden, salarion;

    Scanner input = new Scanner(System.in);
    
    cadastro_teste t1 = new cadastro_teste();
    
    
    System.out.println("Escreva o número de trabalhadores aqui: ");
    x = input.nextInt();
    
        for(int i = 0; i < x; i++){
            System.out.println("Escreva o nome do trabalhador " +i);
            input.nextLine();
            nomet = input.nextLine();
            
            t1.nome[i] = nomet;

            System.out.println("Qual a idade do trabalhador " +i);
            idaden = Integer.parseInt(input.nextLine());
            
            t1.idade[i] = idaden;
            
            System.out.println("Qual o salario do trabalhador " +i);
            salarion = input.nextInt();
            
            t1.salario[i] = salarion;
            cont++;
        }
        while(m !=4){
        System.out.println("Deseja fazer o que?");
        System.out.println("Mudar salario = 1");
        System.out.println("Adicionar funcionario = 2");
        System.out.println("Ver todos funcionarios = 3");
        System.out.println("fechar programa = 4");
        m = input.nextInt();
        nf = cont;

            if(m == 1){
                while(m == 1 && g == 0 || g == 2){
                    System.out.println("Digite o número do funcionario que deseja mudar: ");
                    f = input.nextInt();
                    System.out.println("O funcionario é este? " + t1.nome[f]);
                    System.out.println("Se sim, digite 1, se não, digite 2");
                    g = input.nextInt();
                        if(g == 2){
                            System.out.println("Quer ver a lista de todos os funcionarios? 1. Para sim 2. Para nao");
                            ver = input.nextInt();

                        if (ver == 1){
                            while(o != cont){
                            System.out.println("Funcionaro numero " + o +" Tem nome: " +t1.nome[o]);
                            o++;
                            }
                        }
                    }
                }
                if(g == 1){
                    System.out.println("O que deseja fazer?");
                    System.out.println("Para aumentar salario digite 1.");
                    System.out.println("Para diminuir salario digite 2.");
        
                    h = input.nextInt();
            
                    if(h == 1){
                        System.out.println("Qual a porcentagem? (de 1 a 100) ");
                        por = input.nextInt();
                        por = por/100;
                        sal = por * t1.salario[f] + t1.salario[f];
                    }
                    else if(h == 2){
                    System.out.println("Qual a porcentagem? (de 1 a 100) "); 
                    por = input.nextInt();
                    por = por/100;
                    sal = t1.salario[f] - (por * t1.salario[f]);
                    }

                System.out.println("O salario atual do funcionario " + t1.nome[f]);
                System.out.println("É de: " + sal);
                t1.salario[f] = (int) sal;
                }
            g = 0;
            }

            else if(m == 2){
                System.out.println("Quantos funcionarios quer adicionar?");
                add = input.nextInt();
                tot = add+nf;

                while(cont != tot){
                System.out.println("Escreva o nome do trabalhador " +cont);
                input.nextLine();
                nomet = input.nextLine();
            
                t1.nome[cont] = nomet;

                System.out.println("Qual a idade do trabalhador " +cont);
                idaden = Integer.parseInt(input.nextLine());
            
                t1.idade[cont] = idaden;
            
                System.out.println("Qual o salario do trabalhador " +cont);
                salarion = input.nextInt();
            
                t1.salario[cont] = salarion;
                cont++;

                }
            }
            else if (m == 3){
                while(t != cont){
                    System.out.println("_________________________________________");
                    System.out.println("O nome do funcionario " + t + " é " + t1.nome[t]);
                    System.out.println("A idade do funcionario " + t + " é " + t1.idade[t]);
                    System.out.println("O salario do funcionario " + t + " é " + t1.salario[t]);
                    System.out.println("_________________________________________");
                    t++;
                }
            t = 0;
            }
        }
    }
}

