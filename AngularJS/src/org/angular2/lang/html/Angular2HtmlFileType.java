// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.angular2.lang.html;

import com.intellij.ide.highlighter.HtmlFileType;
import org.jetbrains.annotations.NotNull;

public class Angular2HtmlFileType extends HtmlFileType {

  public static final Angular2HtmlFileType NG_FILE_TYPE = new Angular2HtmlFileType();

  protected Angular2HtmlFileType() {
    super(Angular2HtmlLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "Angular2Html";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "Angular HTML Template";
  }
}
