/*
package de.kaiserdragon.callforwardingstatus;
import android.view.WindowManager;
import android.view.Gravity;
import android.view.View;
import android.graphics.PixelFormat;
import android.view.LayoutInflater;
import android.content.Intent;
import android.app.Service;
import android.os.IBinder;

public abstract class FloatingButtonService extends Service {

    private WindowManager windowManager;
    private View floatingButtonView;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        // Create a floating button view
        floatingButtonView = LayoutInflater.from(this).inflate(R.layout.xmlfilelayout, null);

        // Set layout parameters for the floating button
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT
        );

        // Set the initial position of the floating button (e.g., bottom right)
        layoutParams.gravity = Gravity.BOTTOM | Gravity.RIGHT;
        layoutParams.x = 16;
        layoutParams.y = 16;

        // Obtain the WindowManager service
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);

        // Add the floating button view to the window
        windowManager.addView(floatingButtonView, layoutParams);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        // Remove the floating button view from the window
        if (floatingButtonView != null && windowManager != null) {
            windowManager.removeView(floatingButtonView);
        }
    }
}
*/
