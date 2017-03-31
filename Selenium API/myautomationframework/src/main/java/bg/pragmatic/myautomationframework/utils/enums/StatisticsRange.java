package bg.pragmatic.myautomationframework.utils.enums;

public enum StatisticsRange {
		TODAY("Today"),
		THIS_WEEK("This Week"),
		THIS_MONTH("This Month"),
		THIS_YEAR("This Year");
		
		private String statisticsRange;
		
		private StatisticsRange(String statisticsRange) {
			this.statisticsRange = statisticsRange;
		}

		public String getStatisticsRange() {
			return statisticsRange;
		}
		
}
