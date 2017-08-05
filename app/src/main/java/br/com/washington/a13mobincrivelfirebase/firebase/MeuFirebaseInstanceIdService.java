package br.com.washington.a13mobincrivelfirebase.firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by washington on 05/08/2017.
 */

public class MeuFirebaseInstanceIdService extends FirebaseInstanceIdService{

    @Override
    public  void onTokenRefresh(){
        super.onTokenRefresh();
        String firebaseToken = FirebaseInstanceId.getInstance().getToken();
        sendRegistrationToServer(firebaseToken);
    }


    private void sendRegistrationToServer(String token){

    }
}
