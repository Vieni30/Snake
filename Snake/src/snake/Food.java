package snake;

import java.awt.Graphics2D;

public class Food extends Block
{
    public Food(GameMap map, int x, int y)
    {
        super(map, x, y);
    }

    @Override
    public void draw(Graphics2D g2, int coordX, int coordY) {
        int tileSize = this.map.getTilesize();

        g2.drawImage(this.imageMap.get("grass"), coordX*tileSize, coordY*tileSize, tileSize, tileSize, null);
        g2.drawImage(this.imageMap.get("apple"), coordX*tileSize, coordY*tileSize, tileSize, tileSize, null);
    }

    @Override
    public void update(long millisecs) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void hit(Head head, GameMap map)
    {
        map.foodEaten();
    }

}
