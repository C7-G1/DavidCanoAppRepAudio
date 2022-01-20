package david.cano.davidcanoapprepaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp=new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp=MediaPlayer.create(this,R.raw.stilllovingyou);

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

}