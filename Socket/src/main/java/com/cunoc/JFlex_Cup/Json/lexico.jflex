/*primer seccion: codigo java que se copiara arriba*/
package com.cunoc.JFlex_Cup.Json;


import java_cup.runtime.*;
import java.util.List;
import java.util.ArrayList;
import com.cunoc.JFlex_Cup.Token;
import com.cunoc.Server.Console;

%%
/*segunda seccion: configuracion*/
%class LexicoJson
%unicode
%line
%column
%cup
%public
%{
    private  List<Token> listComments =  new ArrayList<>();
    private String report = "";
    private void addComments(){
        listComments.add(new Token((yyline+1),(yycolumn+1),yytext()));
    }
    private void print(String token){
        //Console.ConsoleText.append("\n<linea:"+(yyline+1)+"><colum:"+(yycolumn+1)+"><TOKEN:"+yytext()+">");
        //report+="\n<linea:"+(yyline+1)+"><colum:"+(yycolumn+1)+"><TOKEN:"+yytext()+">";
    }
    public String getReport(){
        return this.report;
    }
    public void setReport(String repor){
        this.report = repor;
    }
    
    public List<Token>  getlistComments(){
        return this.listComments;
    };
%}
CARACTER = ([a-z]|"_")[a-zA-Z][a-zA-Z0-9]+
//STRING = "\""~"\""
COLOR = ("#")[a-zA-Z0-9][a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?
COMILLAS_DOBLE = "\"" 
ENTERO =[0-9]+
DECIMAL = {ENTERO}[.]{ENTERO}
espacio =[\r|\t|\f|\n|\s| ]+
%%
/*tercer seccion: reglase lexicas*/
/*INGNORAR*/
{espacio}           {/*ESPACIOS*/}
/*FINAL INGNORAR*/
"\"all\""		 		    {print("all"                        );return new Symbol(sym.ALL   ,yyline,yycolumn, (yytext())); }
"\"worlds\""		 		{print("worlds"                     );return new Symbol(sym.WORLDS   ,yyline,yycolumn, (yytext())); }
"\"world\"" 		 		{print("world"                      );return new Symbol(sym.WORLD   ,yyline,yycolumn, (yytext())); }
/*ATRIBUTOS DE MAPA*/
"\"name\""		 		    {print("name"                       );return new Symbol(sym.NAME   ,yyline,yycolumn, (yytext())); }
"\"rows\""		 		    {print("rows"                       );return new Symbol(sym.ROWS   ,yyline,yycolumn, (yytext())); }
"\"cols\""		 		    {print("cols"                       );return new Symbol(sym.COLS   ,yyline,yycolumn, (yytext())); }
"\"config\""		 		{print("config"                     );return new Symbol(sym.COFIG   ,yyline,yycolumn, (yytext())); }
"\"board\""		 		    {print("board"                      );return new Symbol(sym.BOARD   ,yyline,yycolumn, (yytext())); }
"\"boxes\""		 		    {print("boxes"                      );return new Symbol(sym.BOXES   ,yyline,yycolumn, (yytext())); }
"\"player\""		 		{print("player"                     );return new Symbol(sym.PLAYER   ,yyline,yycolumn, (yytext())); }
"\"targets\""		 		{print("targets"                    );return new Symbol(sym.TARGETS   ,yyline,yycolumn, (yytext())); }
/*CONFIGURACION DE COLOR*/
"\"box_color\""		 		{print("box_color"                  );return new Symbol(sym.BOX_COLOR   ,yyline,yycolumn, (yytext())); }
"\"box_on_target_color\""	{print("box_on_target_color"        );return new Symbol(sym.BOX_ON_COLOR   ,yyline,yycolumn, (yytext())); }
"\"target_color\""		 	{print("target_color"               );return new Symbol(sym.TAGET_COLOR   ,yyline,yycolumn, (yytext())); }
"\"brick_color\""		 	{print("brick_color"                );return new Symbol(sym.BRICK_COLOR   ,yyline,yycolumn, (yytext())); }
"\"hall_color\""		 	{print("hall_color"                 );return new Symbol(sym.HALL_COLOR   ,yyline,yycolumn, (yytext())); }
"\"undefined_color\""		{print("undefined_color"            );return new Symbol(sym.UNDEFINED_COLOR   ,yyline,yycolumn, (yytext())); }
"\"player_color\""		 	{print("player_color"               );return new Symbol(sym.PLAYER_COLOR   ,yyline,yycolumn, (yytext())); }
/*TIPO DE HALL O BRICK*/
"\"posX\""		 		    {print("posX"                       );return new Symbol(sym.POSX   ,yyline,yycolumn, (yytext())); }
"\"posY\""		 		    {print("posY"                       );return new Symbol(sym.POSY   ,yyline,yycolumn, (yytext())); }
"\"type\""		 		    {print("type"                       );return new Symbol(sym.TYPE   ,yyline,yycolumn, (yytext())); }
"\"BRICK\""		 		    {print("BRICK"                       );return new Symbol(sym.BRICK   ,yyline,yycolumn, (yytext())); }
"\"HALL\""		 		    {print("HALL"                       );return new Symbol(sym.HALL   ,yyline,yycolumn, (yytext())); }
/*FINAL PALABRAS CLAVES*/
/*SIMBOLOS DE PUNTUACION*/
":"                 {print(":");return new Symbol(sym.DOBLE_PUNTO,yyline,yycolumn, (yytext())); }
","                 {print(",");return new Symbol(sym.COMA,yyline,yycolumn, (yytext())); }
/*FINAL SIMBOLOS DE PUNTUACION*/
/*SIMBOLOS ARITMETRICOS*/
"+"                 {print("+");return new Symbol(sym.SUMAR,yyline,yycolumn, (yytext())); }
"-"                 {print("-");return new Symbol(sym.RESTAR,yyline,yycolumn, (yytext())); }
"*"                 {print("*");return new Symbol(sym.MULTIPLICAR,yyline,yycolumn, (yytext())); }
"/"                 {print("/");return new Symbol(sym.DIVIDIR,yyline,yycolumn, (yytext())); }
/*FINAL SIMBOLOS ARITMETRICOS*/
/*SIMBOLO DE AGRUPACION*/
"("                 {print("(");return new Symbol(sym.P_APERTURA,yyline,yycolumn, (yytext())); }
")"                 {print(")");return new Symbol(sym.P_CIERRE,yyline,yycolumn, (yytext())); }
"{"                 {print("{");return new Symbol(sym.L_APERTURA,yyline,yycolumn, (yytext())); }
"}"                 {print("}");return new Symbol(sym.L_CIERRE,yyline,yycolumn, (yytext())); }
"["                 {print("[");return new Symbol(sym.C_APERTURA,yyline,yycolumn, (yytext())); }
"]"                 {print("]");return new Symbol(sym.C_CIERRE,yyline,yycolumn, (yytext())); }
/*FINAL SIMBOLO DE AGRUPACION*/
/*Token*/
{COMILLAS_DOBLE}{CARACTER}{COMILLAS_DOBLE}          {print("{CARACTER}" );return new Symbol(sym.CARACTER,yyline,yycolumn, (yytext())); }
{COMILLAS_DOBLE}{COLOR}{COMILLAS_DOBLE}          {print(yytext() );return new Symbol(sym.COLOR,yyline,yycolumn, (yytext())); }
{ENTERO}            {print("{NUMERO}" );return new Symbol(sym.ENTERO,yyline,yycolumn, (yytext())); }
{COMILLAS_DOBLE}    {print("\"");return new Symbol(sym.COMILLAS,yyline,yycolumn, (yytext())); }
/*ERROR LEXICO*/
[^]                 { print("ERROR"); }