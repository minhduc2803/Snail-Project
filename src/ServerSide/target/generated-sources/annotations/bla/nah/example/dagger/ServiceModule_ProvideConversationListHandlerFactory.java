package bla.nah.example.dagger;

import bla.nah.example.cache.ConversationListCache;
import bla.nah.example.da.ConversationMemberDA;
import bla.nah.example.da.TransactionProvider;
import bla.nah.example.handler.ConversationListHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServiceModule_ProvideConversationListHandlerFactory implements Factory<ConversationListHandler> {
  private final ServiceModule module;

  private final Provider<ConversationMemberDA> conversationMemberDAProvider;

  private final Provider<TransactionProvider> transactionProvider;

  private final Provider<ConversationListCache> conversationListCacheProvider;

  public ServiceModule_ProvideConversationListHandlerFactory(ServiceModule module,
      Provider<ConversationMemberDA> conversationMemberDAProvider,
      Provider<TransactionProvider> transactionProvider,
      Provider<ConversationListCache> conversationListCacheProvider) {
    this.module = module;
    this.conversationMemberDAProvider = conversationMemberDAProvider;
    this.transactionProvider = transactionProvider;
    this.conversationListCacheProvider = conversationListCacheProvider;
  }

  @Override
  public ConversationListHandler get() {
    return provideConversationListHandler(module, conversationMemberDAProvider.get(), transactionProvider.get(), conversationListCacheProvider.get());
  }

  public static ServiceModule_ProvideConversationListHandlerFactory create(ServiceModule module,
      Provider<ConversationMemberDA> conversationMemberDAProvider,
      Provider<TransactionProvider> transactionProvider,
      Provider<ConversationListCache> conversationListCacheProvider) {
    return new ServiceModule_ProvideConversationListHandlerFactory(module, conversationMemberDAProvider, transactionProvider, conversationListCacheProvider);
  }

  public static ConversationListHandler provideConversationListHandler(ServiceModule instance,
      ConversationMemberDA conversationMemberDA, TransactionProvider transactionProvider,
      ConversationListCache conversationListCache) {
    return Preconditions.checkNotNull(instance.provideConversationListHandler(conversationMemberDA, transactionProvider, conversationListCache), "Cannot return null from a non-@Nullable @Provides method");
  }
}
