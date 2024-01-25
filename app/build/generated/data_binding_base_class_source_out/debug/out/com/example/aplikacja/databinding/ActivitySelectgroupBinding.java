// Generated by view binder compiler. Do not edit!
package com.example.aplikacja.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.aplikacja.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySelectgroupBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout LinerGroup;

  @NonNull
  public final ImageView bg2;

  @NonNull
  public final AppCompatButton enterBackSelect;

  @NonNull
  public final AppCompatButton enterBtnBlind;

  @NonNull
  public final AppCompatButton enterBtnVolunteer;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView welcomeDescSelect;

  @NonNull
  public final TextView welcomeTitle;

  private ActivitySelectgroupBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout LinerGroup, @NonNull ImageView bg2,
      @NonNull AppCompatButton enterBackSelect, @NonNull AppCompatButton enterBtnBlind,
      @NonNull AppCompatButton enterBtnVolunteer, @NonNull ImageView imageView,
      @NonNull TextView welcomeDescSelect, @NonNull TextView welcomeTitle) {
    this.rootView = rootView;
    this.LinerGroup = LinerGroup;
    this.bg2 = bg2;
    this.enterBackSelect = enterBackSelect;
    this.enterBtnBlind = enterBtnBlind;
    this.enterBtnVolunteer = enterBtnVolunteer;
    this.imageView = imageView;
    this.welcomeDescSelect = welcomeDescSelect;
    this.welcomeTitle = welcomeTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySelectgroupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySelectgroupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_selectgroup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySelectgroupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.LinerGroup;
      LinearLayout LinerGroup = ViewBindings.findChildViewById(rootView, id);
      if (LinerGroup == null) {
        break missingId;
      }

      id = R.id.bg2;
      ImageView bg2 = ViewBindings.findChildViewById(rootView, id);
      if (bg2 == null) {
        break missingId;
      }

      id = R.id.enterBackSelect;
      AppCompatButton enterBackSelect = ViewBindings.findChildViewById(rootView, id);
      if (enterBackSelect == null) {
        break missingId;
      }

      id = R.id.enterBtnBlind;
      AppCompatButton enterBtnBlind = ViewBindings.findChildViewById(rootView, id);
      if (enterBtnBlind == null) {
        break missingId;
      }

      id = R.id.enterBtnVolunteer;
      AppCompatButton enterBtnVolunteer = ViewBindings.findChildViewById(rootView, id);
      if (enterBtnVolunteer == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.welcomeDescSelect;
      TextView welcomeDescSelect = ViewBindings.findChildViewById(rootView, id);
      if (welcomeDescSelect == null) {
        break missingId;
      }

      id = R.id.welcomeTitle;
      TextView welcomeTitle = ViewBindings.findChildViewById(rootView, id);
      if (welcomeTitle == null) {
        break missingId;
      }

      return new ActivitySelectgroupBinding((ConstraintLayout) rootView, LinerGroup, bg2,
          enterBackSelect, enterBtnBlind, enterBtnVolunteer, imageView, welcomeDescSelect,
          welcomeTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
