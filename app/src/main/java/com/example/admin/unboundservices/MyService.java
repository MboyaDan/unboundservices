package com.example.admin.unboundservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyService extends Service {
    private IBinder  mybinder=new myLocalBinder();
    public MyService() {

    }
    public class myLocalBinder extends Binder {
MyService getservice(){
    return MyService.this;
        }
        public String getCurrenttime(){
            SimpleDateFormat df=new SimpleDateFormat("HH:mm:ss");
            return (df.format(new Date()));
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
