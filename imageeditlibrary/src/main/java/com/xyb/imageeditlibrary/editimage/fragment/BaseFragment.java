package com.xyb.imageeditlibrary.editimage.fragment;


import android.support.v4.app.Fragment;

import com.xyb.imageeditlibrary.editimage.EditImageActivity;
import com.xyb.imageeditlibrary.editimage.contorl.SaveMode;

public abstract class BaseFragment extends Fragment {

    public BaseFragment() {
    }

    protected EditImageActivity activity;

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);

        switch (SaveMode.getInstant().getMode()) {
            case PAINT:

        }
        if (hidden) {

        }
    }
}
