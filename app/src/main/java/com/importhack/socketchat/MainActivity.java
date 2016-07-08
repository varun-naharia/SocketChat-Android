package com.importhack.socketchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.net.Socket;

public class MainActivity extends AppCompatActivity {
    Button btnConnect;
    Button btnDisconnect;
    Button btnSend;

    TextView lblConnection;
    TextView lblMessage;

    EditText txtHost;
    EditText txtPort;
    EditText txtMessage;

    String host;
    String port;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblConnection = (TextView) findViewById(R.id.lblConnection);
        lblMessage = (TextView) findViewById(R.id.lblMessage);
        txtHost = (EditText) findViewById(R.id.txtHost);
        txtPort = (EditText) findViewById(R.id.txtPort);
        txtMessage = (EditText) findViewById(R.id.txtMessage);
        btnConnect = (Button) findViewById(R.id.btnConnect);
        btnDisconnect = (Button) findViewById(R.id.btnDisconnect);
        btnSend = (Button) findViewById(R.id.btnSend);

        btnConnect.setOnClickListener(Connect);
        btnDisconnect.setOnClickListener(Disconnect);
        btnSend.setOnClickListener(Send);

    }

    private View.OnClickListener Connect = new View.OnClickListener() {
        @Override
        public void onClick(View arg0) {
            Toast.makeText(MainActivity.this, "Connect", Toast.LENGTH_LONG).show();
            Socket connection =
            connection.

        }
    };


    private View.OnClickListener Disconnect = new View.OnClickListener() {
        @Override
        public void onClick(View arg0) {
            Toast.makeText(MainActivity.this, "Disconnect", Toast.LENGTH_LONG).show();
        }
    };


    private View.OnClickListener Send = new View.OnClickListener() {
        @Override
        public void onClick(View arg0) {
            Toast.makeText(MainActivity.this, "Send", Toast.LENGTH_LONG).show();
        }
    };
}
