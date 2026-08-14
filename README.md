# Java Practice Files

This repository contains small Java programs I wrote while learning to code, following along
with the **Java Masterclass** course by Tim Buchalka. They're simple, self-contained exercises
— nothing here requires special software beyond what's listed below.

You don't need to know how to program to look through these files or run them. This guide
walks through everything step by step, written for someone with no coding background.

A heads-up if you try running these: most of these programs don't ask you to type anything
— they just print output straight to the screen when run, so it may not be obvious what a
program is actually demonstrating just from watching it run. To help with that, each `.java`
file has comments near the top (either the original exercise instructions, or a short explanation
I wrote of what the code does) — open the file in Notepad first to get that context before
running it.

Lastly, the folders are arranged alphabetically, not by difficulty.

---

## What You'll Need

Just **one thing**: the **Java Development Kit (JDK)**.

---

## Step 1: Install the JDK

1. Go to the official Oracle download page:
   [Java Downloads | Oracle](https://www.oracle.com/ae/java/technologies/downloads/#jdk26-windows)

2. Under the `Windows` section, download the **"x64 Installer"** for the
   latest JDK version (I'm assuming you're on Windows here).
3. Run the downloaded installer and follow the setup wizard.
4. While installing, look for any checkbox mentioning things like
   **"Set JAVA_HOME variable"** or **"Add to PATH"**. If you see one,
   **check it** — this saves you from doing Step 2 manually. Not every
   version of the installer shows this option, so if you don't see it,
   don't worry — just continue to Step 2.

---

## Step 2: Confirm Java Is Set Up Correctly

1. Open the **Command Prompt** (press the Windows key, type `cmd`, and hit
   Enter).
2. Type the following and press Enter:
   ```
   javac -version
   ```
3. If it prints a version number (e.g. `javac 26.0.2`), you're all set —
   skip to Step 3.
4. If instead you see an error like `'javac' is not recognized...`, the
   installer didn't add Java to your system's PATH automatically. Here's
   how to add it manually:

   4.a Press the Windows key, type **env**, and open
      **"Edit the system environment variables."**
   4.b Click the **"Environment Variables..."** button.
   4.c Under **"System variables,"** find and select the variable named
      **Path**, then click **"Edit..."**
   4.d Click **"New"** and add the path to your JDK's `bin` folder. It will
      look something like:
      ```
      C:\Program Files\Java\jdk-26\bin
      ```
      (Check your actual install location if unsure — it's usually under
      `C:\Program Files\Java\`.)
   4.e Click **OK** on all open windows to save.
   4.f Close and reopen Command Prompt, then re-run `javac -version` to
      confirm it works now.

---

## Step 3: Viewing the Code

Every file in this repository ending in `.java` is a plain text file — you
can open and read it with **Notepad** (or any basic text editor):

1. Right-click the `.java` file you want to view.
2. Choose **"Open with"** → **Notepad**.

You'll be able to read the code and any comments explaining what it does,
even without programming knowledge.

---

## Step 4: Building and Running a Program

To actually run one of these programs, you'll use the Command Prompt.

1. Download or clone this repository to your computer.
2. If you used the green **"Code"** button on GitHub and chose
   **"Download ZIP,"** the repository will download as a single
   compressed `.zip` file. You'll need to **extract/unzip it first**
   before you can use it — right-click the downloaded `.zip` file and
   choose **"Extract All..."**, then pick a location to save the
   extracted folder. Command Prompt can't run files that are still
   inside a `.zip`.
3. Open **Command Prompt**.
4. Each exercise lives in its own folder, and each folder contains a
   `Main.java` file (some folders also contain a few other `.java` files
   that `Main.java` depends on — you don't need to run those separately,
   just run `Main.java`). Use the `cd` (change directory) command to
   navigate into the specific exercise folder you want to try. For
   example:
   ```
   cd C:\Users\YourName\Downloads\java-practice-files\exercise-1
   ```
   You'll repeat this `cd` step every time you switch to a different
   exercise folder.
5. **Compile** the code (this translates the human-readable `.java` file
   into something the computer can run):
   ```
   javac Main.java
   ```
   If there's no error message, this step succeeded — you'll see a new
   file appear in the same folder ending in `.class` (and possibly a
   `.class` file for each of the other `.java` files in that folder too,
   if there are any).
6. **Run** the compiled program:
   ```
   java Main
   ```
   (Note: use just `Main`, without `.java` or `.class` at the end.)
7. You should see the program's output printed directly in the Command
   Prompt window.

---

## Troubleshooting

- **`'javac' is not recognized as an internal or external command`**
  Java isn't set up on your system's PATH yet. Revisit Step 2.

- **`Error: Could not find or load main class Main`**
  Make sure you're in the correct folder (Step 4.3) and that you compiled
  the file successfully first (Step 4.4) before trying to run it.

---

Thanks for taking a look at my practice work!
