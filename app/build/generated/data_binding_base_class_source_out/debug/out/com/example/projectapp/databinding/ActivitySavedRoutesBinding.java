// Generated by view binder compiler. Do not edit!
package com.example.projectapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.projectapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySavedRoutesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView SavedRoutesTitle;

  @NonNull
  public final ImageButton homeBtnShowTransports7;

  @NonNull
  public final ListView listviewroutes;

  @NonNull
  public final ImageButton returnBtn7;

  private ActivitySavedRoutesBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView SavedRoutesTitle, @NonNull ImageButton homeBtnShowTransports7,
      @NonNull ListView listviewroutes, @NonNull ImageButton returnBtn7) {
    this.rootView = rootView;
    this.SavedRoutesTitle = SavedRoutesTitle;
    this.homeBtnShowTransports7 = homeBtnShowTransports7;
    this.listviewroutes = listviewroutes;
    this.returnBtn7 = returnBtn7;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySavedRoutesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySavedRoutesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_saved_routes, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySavedRoutesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.SavedRoutesTitle;
      TextView SavedRoutesTitle = rootView.findViewById(id);
      if (SavedRoutesTitle == null) {
        break missingId;
      }

      id = R.id.homeBtnShowTransports7;
      ImageButton homeBtnShowTransports7 = rootView.findViewById(id);
      if (homeBtnShowTransports7 == null) {
        break missingId;
      }

      id = R.id.listviewroutes;
      ListView listviewroutes = rootView.findViewById(id);
      if (listviewroutes == null) {
        break missingId;
      }

      id = R.id.returnBtn7;
      ImageButton returnBtn7 = rootView.findViewById(id);
      if (returnBtn7 == null) {
        break missingId;
      }

      return new ActivitySavedRoutesBinding((ConstraintLayout) rootView, SavedRoutesTitle,
          homeBtnShowTransports7, listviewroutes, returnBtn7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
