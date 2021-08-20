import os

from discord.ext import commands


class Glob:
    def __init__(self):
        self.VERSION = "1.4.0"
        self.DISCORD_TOKEN = os.getenv("DISCORD_BOT_TOKEN")
        self.DATABASE_URL = os.getenv("DATABASE_URL")
        self.GITHUB = "https =//github.com/thisUsernameIsAlredyTaken" \
                      + "/ShikimoriDiscordBot "
        self.SHIKI_API = "https://shikimori.one"
        self.BOT: commands.Bot = None
        self.DB_ADAPTER = None
        self.CFG = None


G = Glob()