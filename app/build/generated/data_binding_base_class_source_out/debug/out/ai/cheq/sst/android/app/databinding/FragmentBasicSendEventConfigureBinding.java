// Generated by view binder compiler. Do not edit!
package ai.cheq.sst.android.app.databinding;

import ai.cheq.sst.android.app.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentBasicSendEventConfigureBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button clearDataLayer;

  @NonNull
  public final EditText client;

  @NonNull
  public final TextView clientLabel;

  @NonNull
  public final ConstraintLayout clientLayout;

  @NonNull
  public final ConstraintLayout dataLayerControlsLayout;

  @NonNull
  public final TextView dataLayerLabel;

  @NonNull
  public final ConstraintLayout dataLayerLayout;

  @NonNull
  public final EditText dataLayerName;

  @NonNull
  public final TextView dataLayerNameLabel;

  @NonNull
  public final ConstraintLayout dataLayerNameLayout;

  @NonNull
  public final EditText domain;

  @NonNull
  public final TextView domainLabel;

  @NonNull
  public final ConstraintLayout domainLayout;

  @NonNull
  public final SwitchCompat enableDebug;

  @NonNull
  public final SwitchCompat includeAdvertisingModel;

  @NonNull
  public final SwitchCompat includeCustomModel;

  @NonNull
  public final ConstraintLayout modelsControlsLayout;

  @NonNull
  public final TextView modelsLabel;

  @NonNull
  public final ConstraintLayout modelsLayout;

  @NonNull
  public final EditText nexusHost;

  @NonNull
  public final TextView nexusHostLabel;

  @NonNull
  public final ConstraintLayout nexusHostLayout;

  @NonNull
  public final ConstraintLayout optionsControlsLayout;

  @NonNull
  public final TextView optionsLabel;

  @NonNull
  public final ConstraintLayout optionsLayout;

  @NonNull
  public final Button populateDataLayer;

  @NonNull
  public final EditText publishPath;

  @NonNull
  public final TextView publishPathLabel;

  @NonNull
  public final ConstraintLayout publishPathLayout;

  private FragmentBasicSendEventConfigureBinding(@NonNull FrameLayout rootView,
      @NonNull Button clearDataLayer, @NonNull EditText client, @NonNull TextView clientLabel,
      @NonNull ConstraintLayout clientLayout, @NonNull ConstraintLayout dataLayerControlsLayout,
      @NonNull TextView dataLayerLabel, @NonNull ConstraintLayout dataLayerLayout,
      @NonNull EditText dataLayerName, @NonNull TextView dataLayerNameLabel,
      @NonNull ConstraintLayout dataLayerNameLayout, @NonNull EditText domain,
      @NonNull TextView domainLabel, @NonNull ConstraintLayout domainLayout,
      @NonNull SwitchCompat enableDebug, @NonNull SwitchCompat includeAdvertisingModel,
      @NonNull SwitchCompat includeCustomModel, @NonNull ConstraintLayout modelsControlsLayout,
      @NonNull TextView modelsLabel, @NonNull ConstraintLayout modelsLayout,
      @NonNull EditText nexusHost, @NonNull TextView nexusHostLabel,
      @NonNull ConstraintLayout nexusHostLayout, @NonNull ConstraintLayout optionsControlsLayout,
      @NonNull TextView optionsLabel, @NonNull ConstraintLayout optionsLayout,
      @NonNull Button populateDataLayer, @NonNull EditText publishPath,
      @NonNull TextView publishPathLabel, @NonNull ConstraintLayout publishPathLayout) {
    this.rootView = rootView;
    this.clearDataLayer = clearDataLayer;
    this.client = client;
    this.clientLabel = clientLabel;
    this.clientLayout = clientLayout;
    this.dataLayerControlsLayout = dataLayerControlsLayout;
    this.dataLayerLabel = dataLayerLabel;
    this.dataLayerLayout = dataLayerLayout;
    this.dataLayerName = dataLayerName;
    this.dataLayerNameLabel = dataLayerNameLabel;
    this.dataLayerNameLayout = dataLayerNameLayout;
    this.domain = domain;
    this.domainLabel = domainLabel;
    this.domainLayout = domainLayout;
    this.enableDebug = enableDebug;
    this.includeAdvertisingModel = includeAdvertisingModel;
    this.includeCustomModel = includeCustomModel;
    this.modelsControlsLayout = modelsControlsLayout;
    this.modelsLabel = modelsLabel;
    this.modelsLayout = modelsLayout;
    this.nexusHost = nexusHost;
    this.nexusHostLabel = nexusHostLabel;
    this.nexusHostLayout = nexusHostLayout;
    this.optionsControlsLayout = optionsControlsLayout;
    this.optionsLabel = optionsLabel;
    this.optionsLayout = optionsLayout;
    this.populateDataLayer = populateDataLayer;
    this.publishPath = publishPath;
    this.publishPathLabel = publishPathLabel;
    this.publishPathLayout = publishPathLayout;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBasicSendEventConfigureBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBasicSendEventConfigureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_basic_send_event_configure, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBasicSendEventConfigureBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.clear_data_layer;
      Button clearDataLayer = ViewBindings.findChildViewById(rootView, id);
      if (clearDataLayer == null) {
        break missingId;
      }

      id = R.id.client;
      EditText client = ViewBindings.findChildViewById(rootView, id);
      if (client == null) {
        break missingId;
      }

      id = R.id.client_label;
      TextView clientLabel = ViewBindings.findChildViewById(rootView, id);
      if (clientLabel == null) {
        break missingId;
      }

      id = R.id.client_layout;
      ConstraintLayout clientLayout = ViewBindings.findChildViewById(rootView, id);
      if (clientLayout == null) {
        break missingId;
      }

      id = R.id.data_layer_controls_layout;
      ConstraintLayout dataLayerControlsLayout = ViewBindings.findChildViewById(rootView, id);
      if (dataLayerControlsLayout == null) {
        break missingId;
      }

      id = R.id.data_layer_label;
      TextView dataLayerLabel = ViewBindings.findChildViewById(rootView, id);
      if (dataLayerLabel == null) {
        break missingId;
      }

      id = R.id.data_layer_layout;
      ConstraintLayout dataLayerLayout = ViewBindings.findChildViewById(rootView, id);
      if (dataLayerLayout == null) {
        break missingId;
      }

      id = R.id.data_layer_name;
      EditText dataLayerName = ViewBindings.findChildViewById(rootView, id);
      if (dataLayerName == null) {
        break missingId;
      }

      id = R.id.data_layer_name_label;
      TextView dataLayerNameLabel = ViewBindings.findChildViewById(rootView, id);
      if (dataLayerNameLabel == null) {
        break missingId;
      }

      id = R.id.data_layer_name_layout;
      ConstraintLayout dataLayerNameLayout = ViewBindings.findChildViewById(rootView, id);
      if (dataLayerNameLayout == null) {
        break missingId;
      }

      id = R.id.domain;
      EditText domain = ViewBindings.findChildViewById(rootView, id);
      if (domain == null) {
        break missingId;
      }

      id = R.id.domain_label;
      TextView domainLabel = ViewBindings.findChildViewById(rootView, id);
      if (domainLabel == null) {
        break missingId;
      }

      id = R.id.domain_layout;
      ConstraintLayout domainLayout = ViewBindings.findChildViewById(rootView, id);
      if (domainLayout == null) {
        break missingId;
      }

      id = R.id.enable_debug;
      SwitchCompat enableDebug = ViewBindings.findChildViewById(rootView, id);
      if (enableDebug == null) {
        break missingId;
      }

      id = R.id.include_advertising_model;
      SwitchCompat includeAdvertisingModel = ViewBindings.findChildViewById(rootView, id);
      if (includeAdvertisingModel == null) {
        break missingId;
      }

      id = R.id.include_custom_model;
      SwitchCompat includeCustomModel = ViewBindings.findChildViewById(rootView, id);
      if (includeCustomModel == null) {
        break missingId;
      }

      id = R.id.models_controls_layout;
      ConstraintLayout modelsControlsLayout = ViewBindings.findChildViewById(rootView, id);
      if (modelsControlsLayout == null) {
        break missingId;
      }

      id = R.id.models_label;
      TextView modelsLabel = ViewBindings.findChildViewById(rootView, id);
      if (modelsLabel == null) {
        break missingId;
      }

      id = R.id.models_layout;
      ConstraintLayout modelsLayout = ViewBindings.findChildViewById(rootView, id);
      if (modelsLayout == null) {
        break missingId;
      }

      id = R.id.nexus_host;
      EditText nexusHost = ViewBindings.findChildViewById(rootView, id);
      if (nexusHost == null) {
        break missingId;
      }

      id = R.id.nexus_host_label;
      TextView nexusHostLabel = ViewBindings.findChildViewById(rootView, id);
      if (nexusHostLabel == null) {
        break missingId;
      }

      id = R.id.nexus_host_layout;
      ConstraintLayout nexusHostLayout = ViewBindings.findChildViewById(rootView, id);
      if (nexusHostLayout == null) {
        break missingId;
      }

      id = R.id.options_controls_layout;
      ConstraintLayout optionsControlsLayout = ViewBindings.findChildViewById(rootView, id);
      if (optionsControlsLayout == null) {
        break missingId;
      }

      id = R.id.options_label;
      TextView optionsLabel = ViewBindings.findChildViewById(rootView, id);
      if (optionsLabel == null) {
        break missingId;
      }

      id = R.id.options_layout;
      ConstraintLayout optionsLayout = ViewBindings.findChildViewById(rootView, id);
      if (optionsLayout == null) {
        break missingId;
      }

      id = R.id.populate_data_layer;
      Button populateDataLayer = ViewBindings.findChildViewById(rootView, id);
      if (populateDataLayer == null) {
        break missingId;
      }

      id = R.id.publish_path;
      EditText publishPath = ViewBindings.findChildViewById(rootView, id);
      if (publishPath == null) {
        break missingId;
      }

      id = R.id.publish_path_label;
      TextView publishPathLabel = ViewBindings.findChildViewById(rootView, id);
      if (publishPathLabel == null) {
        break missingId;
      }

      id = R.id.publish_path_layout;
      ConstraintLayout publishPathLayout = ViewBindings.findChildViewById(rootView, id);
      if (publishPathLayout == null) {
        break missingId;
      }

      return new FragmentBasicSendEventConfigureBinding((FrameLayout) rootView, clearDataLayer,
          client, clientLabel, clientLayout, dataLayerControlsLayout, dataLayerLabel,
          dataLayerLayout, dataLayerName, dataLayerNameLabel, dataLayerNameLayout, domain,
          domainLabel, domainLayout, enableDebug, includeAdvertisingModel, includeCustomModel,
          modelsControlsLayout, modelsLabel, modelsLayout, nexusHost, nexusHostLabel,
          nexusHostLayout, optionsControlsLayout, optionsLabel, optionsLayout, populateDataLayer,
          publishPath, publishPathLabel, publishPathLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
