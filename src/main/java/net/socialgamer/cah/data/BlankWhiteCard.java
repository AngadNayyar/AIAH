package net.socialgamer.cah.data;

public class BlankWhiteCard extends WhiteCard {
  private static final String BLANK_TEXT = "____";
  private final int id;
  private String text;

  public BlankWhiteCard(final int id) {
    this.id = id;
    clear();
  }

  // This wont be used

  public void setDeathHarm(double deathHarm) {

  }

  public void setRandom(double random) {

  }

  public void setPolitical(double political) {

  }

  public void setHuman(double human) {

  }

  public void setReligion(double religion) {

  }

  public void setControversial(double controversial) {

  }

  public void setGross(double gross) {

  }

  public void setScientific(double scientific) {

  }

  public void setRacism(double racism) {

  }

  public void setLocation(double location) {

  }

  public void setCelebrity(double celebrity) {

  }

  public void setSexual(double sexual) {

  }

  public double getDeathHarm() {
    return 0;
  }

  public double getSexual() {
    return 0;
  }

  public double getPolitical() {
    return 0;
  }

  public double getHuman() {
    return 0;
  }

  public double getReligion() {
    return 0;
  }

  public double getControversial() {
    return 0;
  }

  public double getGross() {
    return 0;
  }

  public double getScientific() {
    return 0;
  }

  public double getRacism() {
    return 0;
  }

  public double getLocation() {
    return 0;
  }

  public double getCelebrity() {
    return 0;
  }

  public double getRandom() {
    return 0;
  }


  @Override
  public int getId() {
    return id;
  }

  @Override
  public String getText() {
    return text;
  }

  public void setText(final String text) {
    this.text = text;
  }

  public void clear() {
    setText(BLANK_TEXT);
  }

  @Override
  public String getWatermark() {
    return "____";
  }

  @Override
  public boolean isWriteIn() {
    return true;
  }

}
