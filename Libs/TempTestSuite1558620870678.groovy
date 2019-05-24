import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/GestionCompte/Register')

suiteProperties.put('name', 'Register')

suiteProperties.put('description', 'Suite de cas de tests concernant la page de cr\u00E9ation de compte')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Bart\\Katalon Studio\\DemoWebShop\\Reports\\GestionCompte\\Register\\20190523_161430\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/GestionCompte/Register', suiteProperties, [new TestCaseBinding('Test Cases/GestionCompte/Creation_compte', 'Test Cases/GestionCompte/Creation_compte',  null), new TestCaseBinding('Test Cases/GestionCompte/Creation_compte_np_mailexistant', 'Test Cases/GestionCompte/Creation_compte_np_mailexistant',  null), new TestCaseBinding('Test Cases/GestionCompte/Creation_compte_np_nofirstname', 'Test Cases/GestionCompte/Creation_compte_np_nofirstname',  null), new TestCaseBinding('Test Cases/GestionCompte/Creation_compte_np_nolastname', 'Test Cases/GestionCompte/Creation_compte_np_nolastname',  null), new TestCaseBinding('Test Cases/GestionCompte/Creation_compte_np_nomail', 'Test Cases/GestionCompte/Creation_compte_np_nomail',  null)])
