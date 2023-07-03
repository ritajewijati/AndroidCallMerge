/*
package de.kaiserdragon.callforwardingstatus;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MymainActivity extends AppCompatActivity {
    private static final int REQUEST_PHONE_PERMISSION = 1;
    private TelephonyManager telephonyManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Request necessary permissions
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.READ_PHONE_STATE, Manifest.permission.CALL_PHONE},
                REQUEST_PHONE_PERMISSION);

        // Get the telephony manager
        telephonyManager = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
        // Register the PhoneStateListener
        telephonyManager.listen(phoneStateListener, PhoneStateListener.LISTEN_CALL_STATE);
    }

    private final PhoneStateListener phoneStateListener = new PhoneStateListener() {
        @Override
        public void onCallStateChanged(int state, String incomingNumber) {
            switch (state) {
                case TelephonyManager.CALL_STATE_RINGING:
                    // Incoming call detected
                    // Forward the call to another phone number
                    forwardCall(incomingNumber);
                    break;
                case TelephonyManager.CALL_STATE_IDLE:
                    // Call terminated by the recipient
                    // Continue to forward the call to another phone number
                    forwardCall(incomingNumber);
                    break;
                default:
                    break;
            }
        }
    };

    private void forwardCall(String incomingNumber) {
        // Replace the following phone number with the desired forwarding number
        String forwardingNumber = "ChatBotNumber";

        // Create an Intent to initiate the call forwarding
        Intent callForwardIntent = new Intent(Intent.ACTION_CALL);
        callForwardIntent.setData(Uri.parse("tel:" + forwardingNumber + "," + incomingNumber));

        // Check if the CALL_PHONE permission is granted
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            // Initiate the call forwarding
            startActivity(callForwardIntent);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_PHONE_PERMISSION) {
            // Check if the CALL_PHONE permission is granted
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted, continue with the call forwarding functionality
            } else {
                // Permission denied, handle accordingly (e.g., show an error message)
            }
        }
    }
}

*/
