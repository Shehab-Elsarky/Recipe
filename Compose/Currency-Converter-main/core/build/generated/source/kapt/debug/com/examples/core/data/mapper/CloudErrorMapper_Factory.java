// Generated by Dagger (https://dagger.dev).
package com.examples.core.data.mapper;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CloudErrorMapper_Factory implements Factory<CloudErrorMapper> {
  private final Provider<Gson> gsonProvider;

  public CloudErrorMapper_Factory(Provider<Gson> gsonProvider) {
    this.gsonProvider = gsonProvider;
  }

  @Override
  public CloudErrorMapper get() {
    return newInstance(gsonProvider.get());
  }

  public static CloudErrorMapper_Factory create(Provider<Gson> gsonProvider) {
    return new CloudErrorMapper_Factory(gsonProvider);
  }

  public static CloudErrorMapper newInstance(Gson gson) {
    return new CloudErrorMapper(gson);
  }
}
