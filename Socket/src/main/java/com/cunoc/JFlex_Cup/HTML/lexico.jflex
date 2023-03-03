/*primer seccion: codigo java que se copiara arriba*/
package com.cunoc.JFlex_Cup.HTML;
import java_cup.runtime.*;
import java.util.List;
import java.util.ArrayList;
import com.cunoc.JFlex_Cup.Token;
import com.cunoc.Server.Console;
%%
/*segunda seccion: configuracion*/
%class LexicoHTML
%unicode
%line
%column
%cup
%public
%{
    private String report = "";

    private void print(String token){
        //report+="\n<linea:"+(yyline+1)+"><colum:"+(yycolumn+1)+"><TOKEN:"+yytext()+">";
    }
    public String getReport(){
        return this.report;
    }
    public void setReport(String repor){
        this.report = repor;
    }
%}
CARACTER = ([a-z]|"_")[a-zA-Z][a-zA-Z0-9]+
ENTERO = [0-9]+
COLOR = ("#")[a-zA-Z0-9][a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?
espacio =[\n | \r | \t | \f | \b]+
%%
/*tercer seccion: reglase lexicas*/
/*INGNORAR*/
"</" ~"/>"          {/*COMENTARIO*/}
"<?" ~"?>"          {/*COMENTARIO*/}
{espacio}           {/*ESPACIOS*/}
/*FINAL INGNORAR*/
"<worlds>"			{print("worlds"    );return new Symbol(sym.INICIO_WORLDS ,yyline,yycolumn, (yytext())); }
"</worlds>"			{print("FINAL_worlds"     );return new Symbol(sym.FINAL_WORLDS  ,yyline,yycolumn, (yytext())); }
"<world>"			{print("world"    );return new Symbol(sym.INICIO_WORLD ,yyline,yycolumn, (yytext())); }
"</world>"			{print("FINAL_world"     );return new Symbol(sym.FINAL_WORLD  ,yyline,yycolumn, (yytext())); }
/*ATRIBUTOS DEL MAPA*/
"<name>"			{print("name"    );return new Symbol(sym.INICIO_NAME ,yyline,yycolumn, (yytext())); }
"</name>"			{print("FINAL_name"     );return new Symbol(sym.FINAL_NAME  ,yyline,yycolumn, (yytext())); }
"<rows>"			{print("rows"    );return new Symbol(sym.INICIO_ROWS ,yyline,yycolumn, (yytext())); }
"</rows>"			{print("FINAL_rows"     );return new Symbol(sym.FINAL_ROWS  ,yyline,yycolumn, (yytext())); }
"<cols>"			{print("cols"    );return new Symbol(sym.INICIO_COLS ,yyline,yycolumn, (yytext())); }
"</cols>"			{print("FINAL_cols"     );return new Symbol(sym.FINAL_COLS  ,yyline,yycolumn, (yytext())); }
"<config>"			{print("config"    );return new Symbol(sym.INICIO_CONFIG ,yyline,yycolumn, (yytext())); }
"</config>"			{print("FINAL_config"     );return new Symbol(sym.FINAL_CONFIG  ,yyline,yycolumn, (yytext())); }
/*COLOR*/
"<box_color>"			    {print("box_color"    );return new Symbol(sym.INICIO_BOX_COLOR ,yyline,yycolumn, (yytext())); }
"</box_color>"			    {print("FINAL_box_color"     );return new Symbol(sym.FINAL_BOX_COLOR  ,yyline,yycolumn, (yytext())); }
"<box_on_target_color>"		{print("box_on_target_color"    );return new Symbol(sym.INICIO_BOX_COLOR_ON ,yyline,yycolumn, (yytext())); }
"</box_on_target_color>"	{print("FINAL_box_on_target_color"     );return new Symbol(sym.FINAL_BOX_COLOR_ON  ,yyline,yycolumn, (yytext())); }
"<target_color>"			{print("target_color"    );return new Symbol(sym.INICIO_TARGET_COLOR ,yyline,yycolumn, (yytext())); }
"</target_color>"			{print("FINAL_target_color"     );return new Symbol(sym.FINAL_TARGET_COLOR  ,yyline,yycolumn, (yytext())); }
"<brick_color>"			    {print("brick_color"    );return new Symbol(sym.INICIO_BRICK_COLOR ,yyline,yycolumn, (yytext())); }
"</brick_color>"			{print("FINAL_brick_color"     );return new Symbol(sym.FINAL_BRICK_COLOR  ,yyline,yycolumn, (yytext())); }
"<hall_color>"			    {print("hall_color"    );return new Symbol(sym.INICIO_HALL_COLOR ,yyline,yycolumn, (yytext())); }
"</hall_color>"			    {print("FINAL_hall_color"     );return new Symbol(sym.FINAL_HALL_COLOR  ,yyline,yycolumn, (yytext())); }
"<undefined_color>"			{print("undefined_color"    );return new Symbol(sym.INICIO_UNDEFINED_COLOR ,yyline,yycolumn, (yytext())); }
"</undefined_color>"	    {print("FINAL_undefined_color"     );return new Symbol(sym.FINAL_UNDEFINED_COLOR  ,yyline,yycolumn, (yytext())); }
"<player_color>"			{print("player_color"    );return new Symbol(sym.INICIO_PLAYER_COLOR ,yyline,yycolumn, (yytext())); }
"</player_color>"			{print("FINAL_player_color"     );return new Symbol(sym.FINAL_PLAYER_COLOR  ,yyline,yycolumn, (yytext()));}
/*BLOQUES*/
"<board>"			{print("board"    );return new Symbol(sym.INICIO_BOARD ,yyline,yycolumn, (yytext())); }
"</board>"			{print("FINAL_board"     );return new Symbol(sym.FINAL_BOARD  ,yyline,yycolumn, (yytext())); }
"<boxes>"			{print("boxes"    );return new Symbol(sym.INICIO_BOXES ,yyline,yycolumn, (yytext())); }
"</boxes>"		    {print("FINAL_boxes"     );return new Symbol(sym.FINAL_BOXES  ,yyline,yycolumn, (yytext())); }
"<targets>"			{print("targets"    );return new Symbol(sym.INICIO_TARGETS ,yyline,yycolumn, (yytext())); }
"</targets>"		{print("FINAL_targets"     );return new Symbol(sym.FINAL_TARGETS  ,yyline,yycolumn, (yytext())); }
"<player>"			{print("player"    );return new Symbol(sym.INICIO_PLAYER ,yyline,yycolumn, (yytext())); }
"</player>"		    {print("FINAL_player"     );return new Symbol(sym.FINAL_PLAYER  ,yyline,yycolumn, (yytext())); }
/*POSICIONES EN LA MATRIZ*/
"<posX>"			{print("posX"    );return new Symbol(sym.INICIO_POSX ,yyline,yycolumn, (yytext())); }
"</posX>"			{print("FINAL_posX"     );return new Symbol(sym.FINAL_POSX  ,yyline,yycolumn, (yytext())); }
"<posY>"			{print("posY"    );return new Symbol(sym.INICIO_POSY ,yyline,yycolumn, (yytext())); }
"</posY>"			{print("FINAL_posY"     );return new Symbol(sym.FINAL_POSY  ,yyline,yycolumn, (yytext())); }
"<type>"			{print("type"    );return new Symbol(sym.INICIO_TYPE ,yyline,yycolumn, (yytext())); }
"</type>"			{print("FINAL_type"     );return new Symbol(sym.FINAL_TYPE  ,yyline,yycolumn, (yytext())); }
/*PALABRAS CLAVES*/
"BRICK"		    {print("BRICK"  );return new Symbol(sym.BRICK,yyline,yycolumn, (yytext())); }
"HALL"		    {print("HALL"  );return new Symbol(sym.HALL,yyline,yycolumn, (yytext())); }
/*FINAL PALABRAS CLAVES*/
/*Token*/
{CARACTER}          {print("{ID}" );return new Symbol(sym.CARACTER,yyline,yycolumn, (yytext())); }
{ENTERO}            {print("{ENTERO}" );return new Symbol(sym.ENTERO,yyline,yycolumn, (yytext())); }
{COLOR}             {print(yytext() );return new Symbol(sym.COLOR,yyline,yycolumn, (yytext())); }
/*ERROR LEXICO*/
[^]                 { print("ERROR"); }