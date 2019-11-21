/*
 * Copyright (C) 2016-2019 Lightbend Inc. <https://www.lightbend.com>
 */

package impl;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import java.util.concurrent.CompletableFuture;
import javax.inject.Inject;
import api.FooService;

import akka.stream.javadsl.Source;

public class FooServiceImpl implements FooService {

  @Override
  public ServiceCall<NotUsed, String> foo() {
    return request -> CompletableFuture.completedFuture("Hello-SSL");
  }
}