package graficos.curso.ejercicios.a02_actividades_sistema_resuelto;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void marcar(View v){
        Intent in=new Intent(Intent.ACTION_DIAL,Uri.parse("tel://38383838"));
        this.startActivity(in);
    }
    public void navegar(View v){
        Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.es"));
        this.startActivity(in);
    }
    public void contactos(View v){
        Intent intent=new Intent(Intent.ACTION_PICK,
                Uri.parse("content://contacts/people"));
        this.startActivity(intent);

    }
    public void resultado(View v){
        //lanzamiento de una actividad de otra aplicación a partir de su acción
        Intent in=new Intent("maxam.ejercicio_02.resultado");
        this.startActivity(in);
    }
    public void salir(View v){
        AlertDialog.Builder dlg=new AlertDialog.Builder(this);
        dlg.setMessage("¿Deseas salir?");
        dlg.setTitle("salida");
        dlg.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.finish();
            }
        });
        dlg.setNegativeButton(android.R.string.no,null);
        dlg.setIcon(android.R.drawable.btn_plus);
        dlg.show();
    }
}
