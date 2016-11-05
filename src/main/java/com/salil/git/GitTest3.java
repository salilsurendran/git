package com.salil.git;

/**
 * Created by salilsurendran on 11/4/16.
 * This is a new file in master which is not there in salil3. It should conflict when we do a rebase
 * with dirty files in the working tree
 */
public class GitTest3 {
    //A change made in a different working folder and pushed to upstream repo
    //Change made in Git1 that shouldn't appear in Git2 folder with just a git fetch
    //Change made in Git2 that will not appear in Git1 if a fetch is not done and and just a
    //git merge is done
}
