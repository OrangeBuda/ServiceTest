package pe.test.servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by macmini14 on 11/7/15.
 */
public class MyService extends Service{
    //objeto que se va a realizar para mantener una conexion continua con el componente que se trabaja
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    // el componente devbuelve un entero que es un flag que sirve como reglas para el funcionamiento del Servicio
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }
}
