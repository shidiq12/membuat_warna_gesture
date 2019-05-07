package sidikmilati1998gmail.com;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.BLUE;
import static android.graphics.Color.GRAY;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;
import static android.graphics.Color.WHITE;
import static android.graphics.Color.YELLOW;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    private TextView gestureText;
    private GestureDetectorCompat gDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gestureText = (TextView) findViewById(R.id.gestureStatusText);
        this.gDetector = new GestureDetectorCompat(this, this);
        gDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onDown(MotionEvent event) {
        gestureText.setText("onDown");
        RelativeLayout layout=(RelativeLayout)findViewById(R.id.action);
        layout.setBackgroundColor(GREEN);
        return true;
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY) {
        gestureText.setText("onFling");
        RelativeLayout layout=(RelativeLayout)findViewById(R.id.action);
        layout.setBackgroundColor(YELLOW);
        return true;
    }

    @Override
    public void onLongPress(MotionEvent event) {
        gestureText.setText("onLongPress");
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        gestureText.setText("onScroll");
        RelativeLayout layout=(RelativeLayout)findViewById(R.id.action);
        layout.setBackgroundColor(RED);
        return true;
    }

    @Override
    public void onShowPress(MotionEvent event) {
        gestureText.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent event) {
        gestureText.setText("onSingleTapUp");
        RelativeLayout layout=(RelativeLayout)findViewById(R.id.action);
        layout.setBackgroundColor(BLACK);
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent event) {
        gestureText.setText("onDoubleTap");
        RelativeLayout layout=(RelativeLayout)findViewById(R.id.action);
        layout.setBackgroundColor(GRAY);
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent event) {
        gestureText.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {
        gestureText.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

}