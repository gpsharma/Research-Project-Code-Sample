package com.microsoft.researchtracker.utils;

import android.app.AlertDialog;
import android.content.Context;

import com.microsoft.researchtracker.R;

public class DialogUtil {

    /**
     * Creates a dialog with a single "Continue" button.
     * @param context
     * @param titleResource The title resource.
     * @param messageResource The message resource.
     * @return
     */
    public static AlertDialog.Builder makeContinueDialog(final Context context, final int titleResource, final int messageResource) {
        return new AlertDialog.Builder(context)
                .setTitle(titleResource)
                .setMessage(messageResource)
                .setNeutralButton(R.string.label_continue, null);
    }

    /**
     * Creates a dialog with a single "Go Back" button.
     * @param context
     * @param titleResource The title resource.
     * @param messageResource The message resource.
     * @return
     */
    public static AlertDialog.Builder makeGoBackDialog(final Context context, final int titleResource, final int messageResource) {
        return new AlertDialog.Builder(context)
                .setTitle(titleResource)
                .setMessage(messageResource)
                .setNeutralButton(R.string.label_go_back, null);
    }
}
