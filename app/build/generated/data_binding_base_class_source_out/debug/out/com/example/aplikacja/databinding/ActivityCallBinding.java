// Generated by view binder compiler. Do not edit!
package com.example.aplikacja.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.aplikacja.R;
import com.google.android.gms.maps.MapView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.webrtc.SurfaceViewRenderer;

public final class ActivityCallBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout LinearWhoToCallLayout;

  @NonNull
  public final LinearLayout LinearWhoVolunteerLayout;

  @NonNull
  public final ImageView acceptButton;

  @NonNull
  public final ImageView bg4;

  @NonNull
  public final AppCompatButton callBtn;

  @NonNull
  public final RelativeLayout callLayout;

  @NonNull
  public final RelativeLayout callLayoutBlind;

  @NonNull
  public final AppCompatButton cancelCallBtn;

  @NonNull
  public final LinearLayout controls;

  @NonNull
  public final LinearLayout controls2;

  @NonNull
  public final ImageView endCallButton;

  @NonNull
  public final ImageView endCallButton2;

  @NonNull
  public final AppCompatButton enterBackCall;

  @NonNull
  public final AppCompatButton enterBackCallVolunteer;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final LinearLayout incomingCallLayout;

  @NonNull
  public final TextView incomingNameTV;

  @NonNull
  public final SurfaceViewRenderer localView;

  @NonNull
  public final MapView mapView;

  @NonNull
  public final ImageView micButton;

  @NonNull
  public final ImageView rejectButton;

  @NonNull
  public final SurfaceViewRenderer remoteView;

  @NonNull
  public final ImageView switchCameraButton;

  @NonNull
  public final ImageView switchCameraButton2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textViewCallVolunteer;

  @NonNull
  public final TextView textViewCallVolunteer2;

  @NonNull
  public final TextView textViewCallVolunteer3;

  @NonNull
  public final TextView textViewCallVolunteerTitle;

  @NonNull
  public final ImageView videoButton;

  @NonNull
  public final RelativeLayout whoToCallLayout;

  @NonNull
  public final RelativeLayout whoVolunteerLayout;

  private ActivityCallBinding(@NonNull RelativeLayout rootView,
      @NonNull LinearLayout LinearWhoToCallLayout, @NonNull LinearLayout LinearWhoVolunteerLayout,
      @NonNull ImageView acceptButton, @NonNull ImageView bg4, @NonNull AppCompatButton callBtn,
      @NonNull RelativeLayout callLayout, @NonNull RelativeLayout callLayoutBlind,
      @NonNull AppCompatButton cancelCallBtn, @NonNull LinearLayout controls,
      @NonNull LinearLayout controls2, @NonNull ImageView endCallButton,
      @NonNull ImageView endCallButton2, @NonNull AppCompatButton enterBackCall,
      @NonNull AppCompatButton enterBackCallVolunteer, @NonNull ImageView imageView,
      @NonNull ImageView imageView2, @NonNull LinearLayout incomingCallLayout,
      @NonNull TextView incomingNameTV, @NonNull SurfaceViewRenderer localView,
      @NonNull MapView mapView, @NonNull ImageView micButton, @NonNull ImageView rejectButton,
      @NonNull SurfaceViewRenderer remoteView, @NonNull ImageView switchCameraButton,
      @NonNull ImageView switchCameraButton2, @NonNull TextView textView3,
      @NonNull TextView textViewCallVolunteer, @NonNull TextView textViewCallVolunteer2,
      @NonNull TextView textViewCallVolunteer3, @NonNull TextView textViewCallVolunteerTitle,
      @NonNull ImageView videoButton, @NonNull RelativeLayout whoToCallLayout,
      @NonNull RelativeLayout whoVolunteerLayout) {
    this.rootView = rootView;
    this.LinearWhoToCallLayout = LinearWhoToCallLayout;
    this.LinearWhoVolunteerLayout = LinearWhoVolunteerLayout;
    this.acceptButton = acceptButton;
    this.bg4 = bg4;
    this.callBtn = callBtn;
    this.callLayout = callLayout;
    this.callLayoutBlind = callLayoutBlind;
    this.cancelCallBtn = cancelCallBtn;
    this.controls = controls;
    this.controls2 = controls2;
    this.endCallButton = endCallButton;
    this.endCallButton2 = endCallButton2;
    this.enterBackCall = enterBackCall;
    this.enterBackCallVolunteer = enterBackCallVolunteer;
    this.imageView = imageView;
    this.imageView2 = imageView2;
    this.incomingCallLayout = incomingCallLayout;
    this.incomingNameTV = incomingNameTV;
    this.localView = localView;
    this.mapView = mapView;
    this.micButton = micButton;
    this.rejectButton = rejectButton;
    this.remoteView = remoteView;
    this.switchCameraButton = switchCameraButton;
    this.switchCameraButton2 = switchCameraButton2;
    this.textView3 = textView3;
    this.textViewCallVolunteer = textViewCallVolunteer;
    this.textViewCallVolunteer2 = textViewCallVolunteer2;
    this.textViewCallVolunteer3 = textViewCallVolunteer3;
    this.textViewCallVolunteerTitle = textViewCallVolunteerTitle;
    this.videoButton = videoButton;
    this.whoToCallLayout = whoToCallLayout;
    this.whoVolunteerLayout = whoVolunteerLayout;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCallBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_call, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCallBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.LinearWhoToCallLayout;
      LinearLayout LinearWhoToCallLayout = ViewBindings.findChildViewById(rootView, id);
      if (LinearWhoToCallLayout == null) {
        break missingId;
      }

      id = R.id.LinearWhoVolunteerLayout;
      LinearLayout LinearWhoVolunteerLayout = ViewBindings.findChildViewById(rootView, id);
      if (LinearWhoVolunteerLayout == null) {
        break missingId;
      }

      id = R.id.acceptButton;
      ImageView acceptButton = ViewBindings.findChildViewById(rootView, id);
      if (acceptButton == null) {
        break missingId;
      }

      id = R.id.bg4;
      ImageView bg4 = ViewBindings.findChildViewById(rootView, id);
      if (bg4 == null) {
        break missingId;
      }

      id = R.id.callBtn;
      AppCompatButton callBtn = ViewBindings.findChildViewById(rootView, id);
      if (callBtn == null) {
        break missingId;
      }

      id = R.id.callLayout;
      RelativeLayout callLayout = ViewBindings.findChildViewById(rootView, id);
      if (callLayout == null) {
        break missingId;
      }

      id = R.id.callLayoutBlind;
      RelativeLayout callLayoutBlind = ViewBindings.findChildViewById(rootView, id);
      if (callLayoutBlind == null) {
        break missingId;
      }

      id = R.id.cancelCallBtn;
      AppCompatButton cancelCallBtn = ViewBindings.findChildViewById(rootView, id);
      if (cancelCallBtn == null) {
        break missingId;
      }

      id = R.id.controls;
      LinearLayout controls = ViewBindings.findChildViewById(rootView, id);
      if (controls == null) {
        break missingId;
      }

      id = R.id.controls2;
      LinearLayout controls2 = ViewBindings.findChildViewById(rootView, id);
      if (controls2 == null) {
        break missingId;
      }

      id = R.id.end_call_button;
      ImageView endCallButton = ViewBindings.findChildViewById(rootView, id);
      if (endCallButton == null) {
        break missingId;
      }

      id = R.id.end_call_button2;
      ImageView endCallButton2 = ViewBindings.findChildViewById(rootView, id);
      if (endCallButton2 == null) {
        break missingId;
      }

      id = R.id.enterBackCall;
      AppCompatButton enterBackCall = ViewBindings.findChildViewById(rootView, id);
      if (enterBackCall == null) {
        break missingId;
      }

      id = R.id.enterBackCallVolunteer;
      AppCompatButton enterBackCallVolunteer = ViewBindings.findChildViewById(rootView, id);
      if (enterBackCallVolunteer == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.incomingCallLayout;
      LinearLayout incomingCallLayout = ViewBindings.findChildViewById(rootView, id);
      if (incomingCallLayout == null) {
        break missingId;
      }

      id = R.id.incomingNameTV;
      TextView incomingNameTV = ViewBindings.findChildViewById(rootView, id);
      if (incomingNameTV == null) {
        break missingId;
      }

      id = R.id.localView;
      SurfaceViewRenderer localView = ViewBindings.findChildViewById(rootView, id);
      if (localView == null) {
        break missingId;
      }

      id = R.id.mapView;
      MapView mapView = ViewBindings.findChildViewById(rootView, id);
      if (mapView == null) {
        break missingId;
      }

      id = R.id.mic_button;
      ImageView micButton = ViewBindings.findChildViewById(rootView, id);
      if (micButton == null) {
        break missingId;
      }

      id = R.id.rejectButton;
      ImageView rejectButton = ViewBindings.findChildViewById(rootView, id);
      if (rejectButton == null) {
        break missingId;
      }

      id = R.id.remoteView;
      SurfaceViewRenderer remoteView = ViewBindings.findChildViewById(rootView, id);
      if (remoteView == null) {
        break missingId;
      }

      id = R.id.switch_camera_button;
      ImageView switchCameraButton = ViewBindings.findChildViewById(rootView, id);
      if (switchCameraButton == null) {
        break missingId;
      }

      id = R.id.switch_camera_button2;
      ImageView switchCameraButton2 = ViewBindings.findChildViewById(rootView, id);
      if (switchCameraButton2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textViewCallVolunteer;
      TextView textViewCallVolunteer = ViewBindings.findChildViewById(rootView, id);
      if (textViewCallVolunteer == null) {
        break missingId;
      }

      id = R.id.textViewCallVolunteer2;
      TextView textViewCallVolunteer2 = ViewBindings.findChildViewById(rootView, id);
      if (textViewCallVolunteer2 == null) {
        break missingId;
      }

      id = R.id.textViewCallVolunteer3;
      TextView textViewCallVolunteer3 = ViewBindings.findChildViewById(rootView, id);
      if (textViewCallVolunteer3 == null) {
        break missingId;
      }

      id = R.id.textViewCallVolunteerTitle;
      TextView textViewCallVolunteerTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewCallVolunteerTitle == null) {
        break missingId;
      }

      id = R.id.video_button;
      ImageView videoButton = ViewBindings.findChildViewById(rootView, id);
      if (videoButton == null) {
        break missingId;
      }

      id = R.id.whoToCallLayout;
      RelativeLayout whoToCallLayout = ViewBindings.findChildViewById(rootView, id);
      if (whoToCallLayout == null) {
        break missingId;
      }

      id = R.id.whoVolunteerLayout;
      RelativeLayout whoVolunteerLayout = ViewBindings.findChildViewById(rootView, id);
      if (whoVolunteerLayout == null) {
        break missingId;
      }

      return new ActivityCallBinding((RelativeLayout) rootView, LinearWhoToCallLayout,
          LinearWhoVolunteerLayout, acceptButton, bg4, callBtn, callLayout, callLayoutBlind,
          cancelCallBtn, controls, controls2, endCallButton, endCallButton2, enterBackCall,
          enterBackCallVolunteer, imageView, imageView2, incomingCallLayout, incomingNameTV,
          localView, mapView, micButton, rejectButton, remoteView, switchCameraButton,
          switchCameraButton2, textView3, textViewCallVolunteer, textViewCallVolunteer2,
          textViewCallVolunteer3, textViewCallVolunteerTitle, videoButton, whoToCallLayout,
          whoVolunteerLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
