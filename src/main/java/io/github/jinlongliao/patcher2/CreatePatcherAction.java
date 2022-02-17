package io.github.jinlongliao.patcher2;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * 主方法
 * @author liaojinlong
 * @since 2022-02-17 20:19
 */
public class CreatePatcherAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {
        PatcherDialogFactory.getInstance(event);
    }
}
