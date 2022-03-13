package com.zhivaevartem.siliciumbot.constant;

import com.zhivaevartem.siliciumbot.persistence.entity.ReadyCheckGuildConfig.ReadyCheckOption;
import java.util.List;

/**
 * Constant strings.
 */
public class StringConstants {
  public static final String DEFAULT_BOT_COMMAND_PREFIX = "D";

  public static final String[][] DEFAULT_READY_CHECK_OPTIONS_ = new String[][] {
    {"✅", "Ready"},
    {"⌚", "Later"},
    {"❌", "Not ready"}
  };

  public static final List<ReadyCheckOption> DEFAULT_READY_CHECK_OPTIONS
      = List.of(new ReadyCheckOption[] {
        new ReadyCheckOption("✅", "Ready"),
        new ReadyCheckOption("⌚", "Later"),
        new ReadyCheckOption("❌", "Not ready")
      });

  public static final String EMPTY_READY_CHECK_VALUE = "No votes...";

  public static final String READY_CHECK_EMBED_TITLE = "==== Ready check ====";

  public static final String UNKNOWN_GUILD_ID = "<UNKNOWN GUILD ID>";

  private StringConstants() {}
}