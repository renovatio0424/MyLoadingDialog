package com.reno.myloadingdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.util.Log;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;

/**
 * TODO
 * <p>
 * 1. 배경을 투명하게 만들어 보기
 * 2. 다이얼 로그 화면의 바깥을 클릭했을 경우 꺼지는 기능 (cancelable) 을 추가 해보기
 * 3. kotlin 으로 바꿔보기
 */
public class LoadingDialog extends Dialog {
    
    public LoadingDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.loading_dialog);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }
}
