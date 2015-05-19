package com.roger.missview.library;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/**
 * Created by Administrator on 2015/4/30.
 */
public class MissView extends GLTextureView implements
        RenderController.Callbacks,
        BlurRenderer.Callbacks {
    private BlurRenderer mRenderer;
    private RenderController mRenderController;


    public MissView(Context context) {
        super(context);
        init();
    }

    public MissView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        mRenderer = new BlurRenderer(getContext(), this);
        setEGLContextClientVersion(2);
        setEGLConfigChooser(8, 8, 8, 8, 0, 0);
        setRenderer(mRenderer);
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }

    public void initPicture(String mPictureName) {
        mRenderController = new DemoRenderController(getContext(), mRenderer,
                this, true, mPictureName);
        mRenderer.setDemoMode(true);
        mRenderController.setVisible(true);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mRenderer.hintViewportSize(w, h);
        mRenderController.reloadCurrentArtwork(true);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (null != mRenderController) {
            mRenderController.destroy();
            queueEventOnGlThread(new Runnable() {
                @Override
                public void run() {
                    mRenderer.destroy();
                }
            });
        }
    }

    @Override
    public void queueEventOnGlThread(Runnable runnable) {
        if (this == null) {
            return;
        }
        super.queueEvent(runnable);
    }

    @Override
    public void requestRender() {
        if (this == null) {
            return;
        }
        super.requestRender();
    }

}
