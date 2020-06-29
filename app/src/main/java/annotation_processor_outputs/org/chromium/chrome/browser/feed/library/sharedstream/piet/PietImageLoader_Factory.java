package org.chromium.chrome.browser.feed.library.sharedstream.piet;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.feed.library.api.host.imageloader.ImageLoaderApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PietImageLoader_Factory implements Factory<PietImageLoader> {
  private final Provider<ImageLoaderApi> imageLoaderApiProvider;

  public PietImageLoader_Factory(Provider<ImageLoaderApi> imageLoaderApiProvider) {
    this.imageLoaderApiProvider = imageLoaderApiProvider;
  }

  @Override
  public PietImageLoader get() {
    return provideInstance(imageLoaderApiProvider);
  }

  public static PietImageLoader provideInstance(Provider<ImageLoaderApi> imageLoaderApiProvider) {
    return new PietImageLoader(imageLoaderApiProvider.get());
  }

  public static PietImageLoader_Factory create(Provider<ImageLoaderApi> imageLoaderApiProvider) {
    return new PietImageLoader_Factory(imageLoaderApiProvider);
  }

  public static PietImageLoader newPietImageLoader(ImageLoaderApi imageLoaderApi) {
    return new PietImageLoader(imageLoaderApi);
  }
}
