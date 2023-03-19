package com.example.boxworld_sokoban.juego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import com.example.boxworld_sokoban.R

class ReportView : AppCompatActivity() {

    private var listadoReprotes = ArrayList<ArrayList<String>>()
    private lateinit var table_game:TableLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_view)
        this.table_game = findViewById<TableLayout>(R.id.table_reports)
        val bundle = getIntent().getSerializableExtra("listado_reportes")
        if (bundle!=null){
            listadoReprotes = bundle as ArrayList<ArrayList<String>>
        }
    }

    /**
     * code for load map
     * */
    public fun loadMap(){
        for (item in this.listadoReprotes){
            val row_one_pruea: TableRow = TableRow(this)
            for(item_intern in item){
                val textView:TextView = TextView(this)
                textView.setText(item_intern)
                row_one_pruea.addView(textView)
            }
            table_game.addView(row_one_pruea)
        }
    }
}