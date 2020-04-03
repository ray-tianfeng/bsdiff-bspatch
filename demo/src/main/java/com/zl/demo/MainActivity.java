package com.zl.demo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Toast;

import com.zl.incremental.BsPatchUtil;

import java.io.File;

public class MainActivity extends Activity {
    String rootPath = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "zl_test";
    String oldApkPath = rootPath + File.separator + "old.apk";
    String patchPath = rootPath + File.separator + "apkPatch.patch";
    String newApkPath = rootPath + File.separator + "new.apk";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bsPatch(View view) {
            int resultCode = BsPatchUtil.bsPatch(oldApkPath, patchPath, newApkPath);
            if(resultCode == 0){
                Toast.makeText(this, "合包成功！", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this, "合包失败！", Toast.LENGTH_LONG).show();
            }
    }
}
