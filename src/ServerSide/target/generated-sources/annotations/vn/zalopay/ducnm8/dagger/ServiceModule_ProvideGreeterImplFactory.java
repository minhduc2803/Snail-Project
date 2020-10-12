package vn.zalopay.ducnm8.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import vn.zalopay.ducnm8.grpc.FintechServiceImpl;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServiceModule_ProvideGreeterImplFactory implements Factory<FintechServiceImpl> {
  private final ServiceModule module;

  public ServiceModule_ProvideGreeterImplFactory(ServiceModule module) {
    this.module = module;
  }

  @Override
  public FintechServiceImpl get() {
    return provideGreeterImpl(module);
  }

  public static ServiceModule_ProvideGreeterImplFactory create(ServiceModule module) {
    return new ServiceModule_ProvideGreeterImplFactory(module);
  }

  public static FintechServiceImpl provideGreeterImpl(ServiceModule instance) {
    return Preconditions.checkNotNull(instance.provideGreeterImpl(), "Cannot return null from a non-@Nullable @Provides method");
  }
}