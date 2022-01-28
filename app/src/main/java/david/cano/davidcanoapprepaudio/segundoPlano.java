package david.cano.davidcanoapprepaudio;

import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

public class segundoPlano extends AsyncTask {

    TextView tv;
    segundoPlano(View v){
        tv=(TextView) v;
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        MediaPlayer mp=new MediaPlayer();
        try{
            mp.setDataSource("http://rpg.hamsterrepublic.com/wiki-images/5/58/Death.ogg");
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
            mp.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mp.start();

        return null;
    }

    protected void onPostExecute(Object o){
        tv.setText("tarea finalizada");
    }
}
