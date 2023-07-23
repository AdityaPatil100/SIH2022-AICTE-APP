package com.example.aicte;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;
import com.yarolegovich.slidingrootnav.SlidingRootNav;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private ImageSlider imageSlider,imageSlider2;

    TextView textView1,textView2,textView3,text1,text2,text3,text4,text5,text6,text7,text8,women1,women2,facilities,facilities1,research1,research2;
    ImageView imageView1,imageView2,imageView3,facebook,twitter,website,image1,image2,image3,image4,dashboard;

    Button button1, button2,button3,skip;


    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        button1=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);

        dashboard=findViewById(R.id.gotoDashboardmain);

        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,DashboardScreen.class));
                finish();
            }
        });

        text1=findViewById(R.id.text_one);
        text2=findViewById(R.id.text_one1);
        text3=findViewById(R.id.text_two);
        text4=findViewById(R.id.text_two2);
        text5=findViewById(R.id.text_three);
        text6=findViewById(R.id.text_three3);
        text7=findViewById(R.id.text_four);
        text8=findViewById(R.id.text_four4);
        women1=findViewById(R.id.women);
        women2=findViewById(R.id.women1);
        facilities=findViewById(R.id.facili);
        facilities1=findViewById(R.id.facili1);
        research1=findViewById(R.id.research);
        research2=findViewById(R.id.research1);

        image1=findViewById(R.id.image_one);
        image2=findViewById(R.id.image_two);
        image3=findViewById(R.id.image_three);
        image4=findViewById(R.id.image_four);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("http://scholarships.gov.in/");
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("http://scholarships.gov.in/");

            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.vidyalakshmi.co.in/Students/indexPopup");

            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.vidyalakshmi.co.in/Students/indexPopup");

            }
        });

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.aicte-india.org/schemes/students-development-schemes");

            }
        });

        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.aicte-india.org/schemes/students-development-schemes");

            }
        });

        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("http://www.ciiinnovation.in/");

            }
        });

        text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("http://www.ciiinnovation.in/");

            }
        });
        women1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.aicte-india.org/opportunities/students/facilites");
            }
        });
        women2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.aicte-india.org/opportunities/students/facilites");
            }
        });
        facilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.aicte-india.org/opportunities/students/facilities-differently-abled");
            }
        });
        facilities1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.aicte-india.org/opportunities/students/facilities-differently-abled");
            }
        });
        research1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.aicte-india.org/opportunities/students/research-funds");
            }
        });
        research2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.aicte-india.org/opportunities/students/research-funds");
            }
        });

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("http://scholarships.gov.in/");

            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.vidyalakshmi.co.in/Students/indexPopup");

            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.aicte-india.org/schemes/students-development-schemes");

            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("http://www.ciiinnovation.in/");

            }
        });



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.aicte-jk-scholarship-gov.in/");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://facilities.aicte-india.org/pgdm/");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://css.aicte-india.org/login");
            }
        });

        drawerLayout=findViewById(R.id.drawerlayout);
        navigationView=findViewById(R.id.navigationView);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.menu_Open,R.string.mnu_Close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);



        facebook=findViewById(R.id.facebook);
        twitter=findViewById(R.id.twitter);
        website=findViewById(R.id.website_icon);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/OfficialAICTE/");
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://twitter.com/AICTE_INDIA");
            }
        });
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.aicte-india.org/");
            }
        });



        imageSlider=findViewById(R.id.image_slider);
        imageSlider2=findViewById(R.id.image_slider2);

        textView1=findViewById(R.id.portal);
        textView2=findViewById(R.id.parakh);
        textView3=findViewById(R.id.approved);

        imageView1=findViewById(R.id.portal_image);
        imageView2=findViewById(R.id.parakh_image);
        imageView3=findViewById(R.id.approved_college_image);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://www.linkpicture.com/q/two.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.linkpicture.com/q/three.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.linkpicture.com/q/four.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.linkpicture.com/q/five_1.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.linkpicture.com/q/six.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.linkpicture.com/q/seven.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.linkpicture.com/q/eight.jpg", ScaleTypes.FIT));


        ArrayList<SlideModel> slideModels1 = new ArrayList<>();

        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/apj%20abdul%20kalam.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Homi%20Jehangir%20Bhabha.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/jagadish%20chandra%20bose.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Srinivasa%20Ramanujan.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Subramaniam%20Chandrasekhar.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Vikram%20Sarabhai.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/swami%20vivekanand.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/asen_0.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/CV-Raman-Banner_2.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/har%20gobing%20khorana_0.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Rabindranath%20Tagore_0.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/visvesvaraya_0.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/mother%20teresa.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/apj%20abdul%20kalam.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Homi%20Jehangir%20Bhabha.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/jagadish%20chandra%20bose.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Srinivasa%20Ramanujan.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Subramaniam%20Chandrasekhar.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Vikram%20Sarabhai.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/swami%20vivekanand.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/asen_0.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/CV-Raman-Banner_2.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/har%20gobing%20khorana_0.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/mother%20teresa.jpg",ScaleTypes.FIT));


        imageSlider.setImageList(slideModels,ScaleTypes.FIT);
        imageSlider2.setImageList(slideModels1,ScaleTypes.FIT);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://internship.aicte-india.org/");
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://parakh.aicte-india.org/");
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.aicte-india.org/education/institutions/Universities");
            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://internship.aicte-india.org/");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://parakh.aicte-india.org/");

            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.aicte-india.org/education/institutions/Universities");
            }
        });

    }



    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void goLink(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{

            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                break;
            case R.id.nav_abt_us:
                Intent intent=new Intent(MainActivity.this,About_us.class);
                startActivity(intent);
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}
