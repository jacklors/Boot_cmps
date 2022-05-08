package com.dio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

//Imprimir um arquivo no console.

	public class CheckedException {
	    public static void main(String[] args) {
	        String nomeDoArquivo = "romances-blake-crouch.txt";

	        try {
	            imprimirArquivoNoConsole(nomeDoArquivo);
	        } catch (FileNotFoundException e) { //Mais especifica na parte superior
	            JOptionPane.showMessageDialog(null,
	                    "Revise o nome do arquivo que você deseja imprimir! " + e.getCause());
	            e.printStackTrace();
	        } catch (IOException e){
	            //e.printStackTrace();
	            JOptionPane.showMessageDialog(null,
	                    "Ocorreu um erro inesperado! Entre em contato com o suporte! " + e.getCause());
	        } finally {
	            System.out.println("Chegou no finally!");
	        }

	        System.out.println("Apesar da exception ou não, o programa continua...");
	    }

	    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
	 
	    	//pegar o arquivo
	    	
	    	
	    	
	    	File file = new File(nomeDoArquivo);
	    	
	    	//Criar um buffer
	        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
	        //Ler linha por linha
	        String line = br.readLine();

	        
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        do{
	            bw.write(line);
	            bw.newLine();
	            line=br.readLine();
	        } while(line != null);//Ler até que a linha seja nula
	        bw.flush();
	        br.close();
	    }
	}