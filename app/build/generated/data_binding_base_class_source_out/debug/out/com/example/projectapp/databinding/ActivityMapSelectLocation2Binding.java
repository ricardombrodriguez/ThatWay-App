// Generated by view binder compiler. Do not edit!
package com.example.projectapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.projectapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMapSelectLocation2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final WebView WebView;

  @NonNull
  public final TextView selectLocationTextView;

  private ActivityMapSelectLocation2Binding(@NonNull ConstraintLayout rootView,
      @NonNull WebView WebView, @NonNull TextView selectLocationTextView) {
    this.rootView = rootView;
    this.WebView = WebView;
    this.selectLocationTextView = selectLocationTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMapSelectLocation2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMapSelectLocation2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_map_select_location2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMapSelectLocation2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.WebView;
      WebView WebView = rootView.findViewById(id);
      if (WebView == null) {
        break missingId;
      }

      id = R.id.selectLocationTextView;
      TextView selectLocationTextView = rootView.findViewById(id);
      if (selectLocationTextView == null) {
        break missingId;
      }

      return new ActivityMapSelectLocation2Binding((ConstraintLayout) rootView, WebView,
          selectLocationTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
