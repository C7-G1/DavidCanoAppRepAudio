package david.cano.davidcanoapprepaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp=new MediaPlayer();
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mp=MediaPlayer.create(this,R.raw.stilllovingyou);
        tv=findViewById(R.id.tvMensaje);
        segundoPlano sp=new segundoPlano(tv);
        sp.execute();
    }

    public void iniciar(View v){
        try {
            mp.prepare();
            mp.start();

        }catch (IOException ex){
            System.out.println("El fichero de audio no existe"+ ex.getMessage());
        }

    }
    public void reiniciar(View v){
        mp.start();
    }
    public void pausar(View v){
       mp.pause();
    }
    public void parar(View v){
        mp.stop();
    }

    //public void sonidoPorInternet(View v){
        //MediaPlayer mp2=new MediaPlayer();
        //try {
          //  mp2.setDataSource("http://rpg.hamsterrepublic.com/wiki-images/5/58/Death.ogg");
        //} catch (IOException e) {
          //  e.printStackTrace();
        //}
        //try {
           // mp2.prepare();
        //} catch (IOException e) {
          //  e.printStackTrace();
        //}
        //mp2.start();
    //}

}