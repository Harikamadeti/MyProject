package com.example.win7.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemActivity extends AppCompatActivity {

    private TextView sitename,location,price,contact;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        sitename=(TextView)findViewById(R.id.itemsitename);
        location=(TextView)findViewById(R.id.itemlocation);
        price=(TextView)findViewById(R.id.itemprice);
        contact=(TextView)findViewById(R.id.itemcontact);
        image=(ImageView)findViewById(R.id.itemthumbnail);

        //recieve data
        Intent intent=getIntent();
        String sitename1=intent.getExtras().getString("Site Name");
        String location1=intent.getExtras().getString("Location");
        String price1=intent.getExtras().getString("Price");
        String contact1=intent.getExtras().getString("Contact");
        int image1=intent.getExtras().getInt("Thumbnail");

        //setting values
        sitename.setText(sitename1);
        location.setText(location1);
        price.setText(price1);
        contact.setText(contact1);
        image.setImageResource(image1);
    }
}
