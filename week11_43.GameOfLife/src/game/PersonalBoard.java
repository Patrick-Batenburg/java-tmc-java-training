/*
 *
 *  * MIT License
 *  *
 *  * Copyright (c) 2017 Patrick van Batenburg
 *  *
 *  * Permission is hereby granted, free of charge, to any person obtaining a copy
 *  * of this software and associated documentation files (the "Software"), to deal
 *  * in the Software without restriction, including without limitation the rights
 *  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  * copies of the Software, and to permit persons to whom the Software is
 *  * furnished to do so, subject to the following conditions:
 *  *
 *  * The above copyright notice and this permission notice shall be included in all
 *  * copies or substantial portions of the Software.
 *  *
 *  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  * SOFTWARE.
 *
 */

package game;

import gameoflife.GameOfLifeBoard;

public class PersonalBoard extends GameOfLifeBoard
{
    public PersonalBoard(int width, int height)
    {
        super(width, height);
    }

    @Override
    public void turnToLiving(int x, int y)
    {
        if (x >= 0 && x <= getWidth() - 1 && y >= 0 && y <= getHeight() - 1)
        {
            getBoard()[x][y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y)
    {
        if (x >= 0 && x <= getWidth() - 1 && y >= 0 && y <= getHeight() - 1)
        {
            getBoard()[x][y] = false;
        }
    }

    @Override
    public boolean isAlive(int x, int y)
    {
        if (x >= 0 && x <= getWidth() - 1 && y >= 0 && y <= getHeight() - 1)
        {
            return getBoard()[x][y];
        }
        else
        {
            return false;
        }
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell)
    {
        int amount = (double) getWidth() * (double) getHeight() * probabilityForEachCell

        for (int i = 0; i <= amount; i++)
        {

        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y)
    {
        return 0;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours)
    {

    }

    @Override
    public void playTurn()
    {
        super.playTurn();
    }

    @Override
    public boolean[][] getBoard()
    {
        return super.getBoard();
    }

    @Override
    public int getWidth()
    {
        return super.getWidth();
    }

    @Override
    public int getHeight()
    {
        return super.getHeight();
    }
}
