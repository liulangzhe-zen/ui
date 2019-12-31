package com.basics.librart;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.basics.ui.view.LottieTabView;

/**
 * @Author: xueshijie
 * @CreateDate: 2019-12-30 16:48
 * @Version: 1.0
 * @Description:  lottie 底部导航栏动画
 */
public class LottieActivity extends AppCompatActivity implements View.OnClickListener {

    private LottieTabView mLottieMainTab;
    private LottieTabView mLottieMsgTab;
    private LottieTabView mLottieDealTab;
    private LottieTabView mLottieMineTab;
    private LottieTabView tab_view_min1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvitiy_lottie);

        mLottieMainTab = findViewById(R.id.tab_view_main);
        mLottieMsgTab = findViewById(R.id.tab_view_msg);
        mLottieDealTab = findViewById(R.id.tab_view_deal);
        mLottieMineTab = findViewById(R.id.tab_view_mine);
        tab_view_min1 = findViewById(R.id.tab_view_min1);


        mLottieMainTab.setOnClickListener(this);
        mLottieMsgTab.setOnClickListener(this);
        mLottieDealTab.setOnClickListener(this);
        mLottieMineTab.setOnClickListener(this);
        tab_view_min1.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tab_view_main:
                mLottieMainTab.selected();
                mLottieMsgTab.unSelected();
                mLottieDealTab.unSelected();
                mLottieMineTab.unSelected();
                tab_view_min1.unSelected();
                break;
            case R.id.tab_view_msg:

                mLottieMsgTab.selected();
                mLottieDealTab.unSelected();
                mLottieMineTab.unSelected();
                mLottieMainTab.unSelected();
                tab_view_min1.unSelected();
                break;
            case R.id.tab_view_deal:

                mLottieDealTab.selected();
                mLottieMsgTab.unSelected();
                mLottieMineTab.unSelected();
                mLottieMainTab.unSelected();
                tab_view_min1.unSelected();
                break;
            case R.id.tab_view_mine:

                mLottieMineTab.selected();
                mLottieMsgTab.unSelected();
                mLottieDealTab.unSelected();
                mLottieMainTab.unSelected();
                tab_view_min1.unSelected();
                break;
            case R.id.tab_view_min1:

                tab_view_min1.selected();

                mLottieMsgTab.unSelected();
                mLottieMineTab.unSelected();
                mLottieDealTab.unSelected();
                mLottieMainTab.unSelected();
                break;
        }
    }
}
